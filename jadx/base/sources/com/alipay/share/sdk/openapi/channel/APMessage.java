package com.alipay.share.sdk.openapi.channel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.alipay.share.sdk.Constant;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: base.apk:libs/libapshare.jar:com/alipay/share/sdk/openapi/channel/APMessage.class */
public class APMessage {
    private static final String TAG = "APSDK.APMessage";

    /* JADX INFO: loaded from: base.apk:libs/libapshare.jar:com/alipay/share/sdk/openapi/channel/APMessage$CallBack.class */
    public interface CallBack {
        void handleMessage(Intent intent);
    }

    public static boolean send(Context context, String receiverPermission, String action, String content, Bundle bundle) {
        String receiverPermission2 = receiverPermission + ".permission.MM_MESSAGE";
        Intent intent = new Intent(action);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        String packageName = context.getPackageName();
        intent.putExtra(Constant.EXTRA_MESSAGE_SDK_VERSION, Constant.SDK_VERSION);
        intent.putExtra(Constant.EXTRA_MESSAGE_APP_PACKAGE_NAME, packageName);
        intent.putExtra(Constant.EXTRA_MESSAGE_CONTENT, content);
        intent.putExtra(Constant.EXTRA_MESSAGE_CHECK_SUM, MMessageUtil.checkSum(content, packageName));
        context.sendBroadcast(intent, receiverPermission2);
        Log.d(TAG, "send ap message, intent=" + intent + ", perm=" + receiverPermission2);
        return true;
    }

    public static void send(Context context, String receiverPermission, String appIdContent) {
        send(context, receiverPermission, "com.alipay.sdk.channel.Intent.ACTION_MESSAGE", appIdContent);
    }

    public static void send(Context context, String receiverPermission, String action, String appIdContent) {
        send(context, receiverPermission, action, appIdContent, null);
    }

    /* JADX INFO: loaded from: base.apk:libs/libapshare.jar:com/alipay/share/sdk/openapi/channel/APMessage$Receiver.class */
    public static final class Receiver extends BroadcastReceiver {
        public static final Map<String, CallBack> callbacks = new HashMap();
        private final CallBack callBack;

        public Receiver() {
            this(null);
        }

        public Receiver(CallBack callBack) {
            this.callBack = callBack;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Log.d(APMessage.TAG, "receive intent=" + intent);
            if (this.callBack != null) {
                this.callBack.handleMessage(intent);
                Log.d(APMessage.TAG, "mm message self-handled");
                return;
            }
            CallBack messageCallBack = callbacks.get(intent.getAction());
            if (messageCallBack != null) {
                messageCallBack.handleMessage(intent);
                Log.d(APMessage.TAG, "mm message handled");
            }
        }

        public static void registerCallBack(String key, CallBack callBack1) {
            callbacks.put(key, callBack1);
        }

        public static void unregisterCallBack(String key) {
            callbacks.remove(key);
        }
    }
}
