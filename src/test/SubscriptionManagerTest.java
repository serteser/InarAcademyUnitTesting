package test;

import main.SubscriptionManager;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubscriptionManagerTest {

    SubscriptionManager manager;

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

        manager = new SubscriptionManager();
    }

    @AfterEach
    void devastateObj() {

        manager = null;
    }

    @Test
    public void TC_006_01_FreeTierEmailNotificationsEnabledAutoRenewal() {

        String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.FREE,

                SubscriptionManager.NotificationPreference.EMAIL, SubscriptionManager.AutoRenewal.ENABLED);

        assertEquals("Subscription Configured: Tier=FREE, Notification=EMAIL, AutoRenewal=ENABLED", result);
    }

    @Test
    public void TC_006_02_StandardTierSmsNotificationsDisabledAutoRenewal() {

        String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD,

                SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);

        assertEquals("Subscription Configured: Tier=STANDARD, Notification=SMS, AutoRenewal=DISABLED", result);
    }

    @Test
    public void TC_006_03_PremiumTierNoneNotificationsEnabledAutoRenewal() {

        String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM,

                SubscriptionManager.NotificationPreference.NONE, SubscriptionManager.AutoRenewal.ENABLED);

        assertEquals("Subscription Configured: Tier=PREMIUM, Notification=NONE, AutoRenewal=ENABLED", result);
    }

    @Test
    public void TC_006_04_FreeTierSmsNotificationsDisabledAutoRenewal() {

        String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.FREE,

                SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);

        assertEquals("Subscription Configured: Tier=FREE, Notification=SMS, AutoRenewal=DISABLED", result);
    }

    @Test
    public void TC_006_05_StandardTierEmailNotificationsEnabledAutoRenewal() {

        String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD,

                SubscriptionManager.NotificationPreference.EMAIL, SubscriptionManager.AutoRenewal.ENABLED);

        assertEquals("Subscription Configured: Tier=STANDARD, Notification=EMAIL, AutoRenewal=ENABLED", result);
    }

    @Test
    public void TC_006_06_PremiumTierSmsNotificationsDisabledAutoRenewal() {

        String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM,

                SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);

        assertEquals("Subscription Configured: Tier=PREMIUM, Notification=SMS, AutoRenewal=DISABLED", result);
    }
}
