package com.onesignal.onesignal.core.internal.user.subscriptions

import com.onesignal.onesignal.core.user.subscriptions.ISmsSubscription
import java.util.*

class SmsSubscription(
        id: UUID,
        enabled: Boolean,
        override val number: String
        ) : Subscription(id, enabled), ISmsSubscription