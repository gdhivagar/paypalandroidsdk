package com.wearedapps.android.paypalandroid;

import android.app.Application;

import com.paypal.checkout.PayPalCheckout;
import com.paypal.checkout.config.CheckoutConfig;
import com.paypal.checkout.config.Environment;
import com.paypal.checkout.config.SettingsConfig;
import com.paypal.checkout.createorder.CurrencyCode;
import com.paypal.checkout.createorder.UserAction;

public class MyApplication extends Application {

    CheckoutConfig checkoutConfig;

    private static final String CLIENT_ID = "ENTER_YOUR_CLIENT_ID"; /*YOUR_CLIENT_ID*/

    @Override
    public void onCreate() {
        super.onCreate();
        checkoutConfig = new CheckoutConfig(
                this,
                CLIENT_ID, /*YOUR_CLIENT_ID*/
                Environment.SANDBOX,
                "com.wearedapps.android.paypalandroid://paypalpay", /*YOUR_RETURN_URl*/
                CurrencyCode.USD,
                UserAction.PAY_NOW,
                new SettingsConfig(
                        true,
                        false));

        PayPalCheckout.setConfig(checkoutConfig);

    }
}
