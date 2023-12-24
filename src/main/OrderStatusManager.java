//          Class:          OrderStatusManager
//          Description:    Manages order states (New, Pending, Shipped, Delivered, Cancelled).
//          Methods:
//                          ● String nextState(String currentState): Returns the next state of an order given the
//                            current state.
//                          ● String cancelOrder(String currentState): Handles order cancellation based on current
//                            state.
package main;
public class OrderStatusManager {

    private OrderState currentState;

    public enum OrderState {
        NEW, PENDING, SHIPPED, DELIVERED, CANCELLED
    }

    /**
     * Transitions the order to the next state based on the current state.
     *
     * @param currentState The current state of the order.
     * @return The next state of the order.
     */
    public OrderState nextState(OrderState currentState) {
        switch (currentState) {
            case NEW:
                this.currentState = OrderState.PENDING;
                return OrderState.PENDING;
            case PENDING:
                this.currentState = OrderState.SHIPPED;
                return OrderState.SHIPPED;
            case SHIPPED:
                this.currentState = OrderState.DELIVERED;
                return OrderState.DELIVERED;
// Delivered and Cancelled are final states and cannot be transitioned from.
            case DELIVERED:
            case CANCELLED:
            default:
                this.currentState = currentState;
                return currentState;
        }
    }

    public OrderState getCurrentState() {
        return currentState;
    }

    /**
     * Cancels the order if it is in a state that allows for cancellation.
     *
     * @param currentState The current state of the order.
     * @return The new state of the order after attempting cancellation.
     */
    public OrderState cancelOrder(OrderState currentState) {

        // Orders can only be cancelled if they are NEW or PENDING.
        if (currentState == OrderState.NEW || currentState == OrderState.PENDING) {
            this.currentState = OrderState.CANCELLED;
            return OrderState.CANCELLED;
        } else {
            // If the order is SHIPPED or beyond, it cannot be cancelled.
            this.currentState = currentState;
            return currentState;
        }
    }
}
