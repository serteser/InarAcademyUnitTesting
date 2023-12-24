//          Class:          SubscriptionManager
//          Description:    The SubscriptionManager class is designed to manage user subscriptions for a
//                          service offering multiple tiers. It allows for diverse subscription configurations, enabling users to
//                          select from various tiers, notification preferences, and auto-renewal options. This class is
//                          particularly suited for Pairwise (All-pairs) Testing due to the combinatorial nature of the
//                          subscription options.
//          Methods:
//                          ● configureSubscription(SubscriptionTier tier, NotificationPreference notification,
//                              AutoRenewal autoRenewal):
//                              Parameters:
//                                  ■   SubscriptionTier tier: The tier of the subscription, with options like FREE,
//                                      STANDARD, and PREMIUM.
//                                  ■   NotificationPreference notification: The user's preference for receiving
//                                      notifications, with options like EMAIL, SMS, and NONE.
//                                  ■   AutoRenewal autoRenewal: The auto-renewal setting for the subscription,
package main;

public class SubscriptionManager {

    // Enums for different options
    public enum SubscriptionTier {FREE, STANDARD, PREMIUM}

    public enum NotificationPreference {EMAIL, SMS, NONE}

    public enum AutoRenewal {ENABLED, DISABLED}

    /**
     * Configures the user's subscription based on the provided options.
     *
     * @param tier         The subscription tier.
     * @param notification The notification preference.
     * @param autoRenewal  The auto-renewal setting.
     * @return A summary of the subscription configuration.
     */
    public String configureSubscription(SubscriptionTier tier, NotificationPreference notification, AutoRenewal autoRenewal) {

    // Logic to configure the subscription based on the options
        return "Subscription Configured: Tier=" + tier + ", Notification=" + notification + ", AutoRenewal=" + autoRenewal;
    }
}
