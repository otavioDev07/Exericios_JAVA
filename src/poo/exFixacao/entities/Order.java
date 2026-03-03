    package poo.exFixacao.entities;
    import poo.exFixacao.entities.enums.OrderStatus;

    import java.time.LocalDateTime;
    import java.time.format.DateTimeFormatter;
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;

    public class Order {
        private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        private LocalDateTime moment;
        private OrderStatus orderStatus;
        private Client client;

        private List<OrderItem> items = new ArrayList<>();

        public Order(LocalDateTime moment, Client client, OrderStatus orderStatus) {
            this.moment = moment;
            this.client = client;
            this.orderStatus = orderStatus;
        }

        public List<OrderItem> items(){
            return Collections.unmodifiableList(items);
        }

        public void addItem(OrderItem item){
            items.add(item);
        }

        public void removeItem(OrderItem item){
            items.remove(item);
        }

        public LocalDateTime getMoment() {
            return moment;
        }

        public void setMoment(LocalDateTime moment) {
            this.moment = moment;
        }

        public OrderStatus getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(OrderStatus orderStatus) {
            this.orderStatus = orderStatus;
        }

        public Client getClient() {
            return client;
        }

        public void setClient(Client client) {
            this.client = client;
        }

        public double total(){
            double sum = 0;
            for (OrderItem item : items){
                sum += item.subTotal();
            }
            return sum;
        }
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append("ORDER SUMMMARY:\n");
            sb.append("Order Moment: ").append(fmt.format(moment)).append("\n");
            sb.append("Order Status: ").append(orderStatus.toString()).append("\n");
            sb.append("Client: ").append(client.getName()).append(" ").append(client.getBirthDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))).append(" - ").append(client.getEmail());
            sb.append("\nOrderItems:\n");
            for (OrderItem item : items){
                sb.append(item.getProduct().getName()).append(", $").append(item.getProduct().getPrice()).append(", Quantity: ").append(item.getQuantity()).append(", Subtotal: $").append(item.subTotal()).append("\n");
            }
            sb.append("Total price: $").append(total());

            return sb.toString();
        }
    }
