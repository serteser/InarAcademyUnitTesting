package test;

import main.OrderStatusManager;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderStatusManagerTest {

    OrderStatusManager order;

    @BeforeAll
    static void testStart() {

        System.out.println("Test has started.");
    }

    @AfterAll
    static void testFinish() {

        System.out.println("Test has finished.");
    }

    @BeforeEach
    void initializeObj() {

        order = new OrderStatusManager();
    }

    @AfterEach
    void devastateObj() {

        order = null;
    }

    @Test
    public void TC_004_01_NextStateTransitionFromNewToPending() {

        assertEquals(order.nextState(OrderStatusManager.OrderState.NEW), order.getCurrentState(),

                "TC_004_01_NextStateTransitionFromNewToPending State should transition from NEW to PENDING");
    }

    @Test
    public void TC_004_02_NextStateTransitionFromPendingToShipped() {

        assertEquals(order.nextState(OrderStatusManager.OrderState.PENDING), order.getCurrentState(),

                "TC_004_02_NextStateTransitionFromPendingToShipped State should transition from PENDING to SHIPPED");
    }

    @Test
    public void TC_004_03_NextStateTransitionFromShippedToDelivered() {

        assertEquals(order.nextState(OrderStatusManager.OrderState.SHIPPED), order.getCurrentState(),

                "TC_004_03_NextStateTransitionFromShippedToDelivered State should transition from SHIPPED to DELIVERED");
    }

    @Test
    public void TC_004_04_NoTransitionFromDELIVERED() {

        assertEquals(order.nextState(OrderStatusManager.OrderState.DELIVERED), order.getCurrentState(),

                "TC_004_04_NoTransitionFromDELIVERED No transition from DELIVERED");
    }

    @Test
    public void TC_004_05_NoTransitionFromCANCELLED() {

        assertEquals(order.nextState(OrderStatusManager.OrderState.CANCELLED), order.getCurrentState(),

                "TC_004_05_NoTransitionFromCANCELLED No transition from CANCELLED");
    }

    @Test
    public void TC_004_06_CancelFromNewState() {

        assertEquals(order.cancelOrder(OrderStatusManager.OrderState.NEW), order.getCurrentState(),

                "TC_004_06_CancelFromNewState Cancel from NEW State");
    }

    @Test
    public void TC_004_07_CancelFromPendingState() {

        assertEquals(order.cancelOrder(OrderStatusManager.OrderState.PENDING), order.getCurrentState(),

                "TC_004_07_CancelFromPendingState Cancel from PENDING State");
    }

    @Test
    public void TC_004_08_NoCancellationFromShippedState() {

        assertEquals(order.cancelOrder(OrderStatusManager.OrderState.PENDING), order.getCurrentState(),

                "TC_004_08_NoCancellationFromShippedState");
    }

    @Test
    public void TC_004_09_NoCancellationFromDeliveredState() {

        assertEquals(order.cancelOrder(OrderStatusManager.OrderState.DELIVERED), order.getCurrentState(),

                "TC_004_09_NoCancellationFromDeliveredState");
    }

    @Test
    public void TC_004_10_NoCancellationFromAlreadyCancelledState() {

        assertEquals(order.cancelOrder(OrderStatusManager.OrderState.CANCELLED), order.getCurrentState(),

                "TC_004_10_NoCancellationFromAlreadyCancelledState");
    }
}
