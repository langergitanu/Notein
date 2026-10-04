package androidx.core.content;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.functions.HttpsCallableResult;
import com.google.gson.Gson;
import com.google.gson.JsonParser;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements Continuation {
    public static String OooO00o(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(task, "task");
        HttpsCallableResult httpsCallableResult = (HttpsCallableResult) task.getResult();
        return JsonParser.parseString(new Gson().toJson(httpsCallableResult != null ? httpsCallableResult.getData() : null));
    }
}
