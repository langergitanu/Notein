package androidx.core.os;

import android.os.Handler;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;
import kotlin.Metadata;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a8\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\n\u001a8\u0010\f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, m80612d2 = {"Landroid/os/Handler;", "", "delayInMillis", "", ResponseType.TOKEN, "Lkotlin/Function0;", "LoO00ooO/OooOooO;", "action", "Ljava/lang/Runnable;", "postDelayed", "(Landroid/os/Handler;JLjava/lang/Object;LoO0O000o/OooO00o;)Ljava/lang/Runnable;", "uptimeMillis", "postAtTime", "core-ktx_release"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class HandlerKt {
    public static final Runnable postAtTime(Handler handler, long j, Object obj, oO0O000o.OooO00o<C32460OooOooO> oooO00o) {
        HandlerKt$postAtTime$runnable$1 handlerKt$postAtTime$runnable$1 = new HandlerKt$postAtTime$runnable$1(oooO00o);
        handler.postAtTime(handlerKt$postAtTime$runnable$1, obj, j);
        return handlerKt$postAtTime$runnable$1;
    }

    public static /* synthetic */ Runnable postAtTime$default(Handler handler, long j, Object obj, oO0O000o.OooO00o oooO00o, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        HandlerKt$postAtTime$runnable$1 handlerKt$postAtTime$runnable$1 = new HandlerKt$postAtTime$runnable$1(oooO00o);
        handler.postAtTime(handlerKt$postAtTime$runnable$1, obj, j);
        return handlerKt$postAtTime$runnable$1;
    }

    public static final Runnable postDelayed(Handler handler, long j, Object obj, oO0O000o.OooO00o<C32460OooOooO> oooO00o) {
        HandlerKt$postDelayed$runnable$1 handlerKt$postDelayed$runnable$1 = new HandlerKt$postDelayed$runnable$1(oooO00o);
        if (obj == null) {
            handler.postDelayed(handlerKt$postDelayed$runnable$1, j);
            return handlerKt$postDelayed$runnable$1;
        }
        HandlerCompat.postDelayed(handler, handlerKt$postDelayed$runnable$1, obj, j);
        return handlerKt$postDelayed$runnable$1;
    }

    public static /* synthetic */ Runnable postDelayed$default(Handler handler, long j, Object obj, oO0O000o.OooO00o oooO00o, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        HandlerKt$postDelayed$runnable$1 handlerKt$postDelayed$runnable$1 = new HandlerKt$postDelayed$runnable$1(oooO00o);
        if (obj == null) {
            handler.postDelayed(handlerKt$postDelayed$runnable$1, j);
            return handlerKt$postDelayed$runnable$1;
        }
        HandlerCompat.postDelayed(handler, handlerKt$postDelayed$runnable$1, obj, j);
        return handlerKt$postDelayed$runnable$1;
    }
}
