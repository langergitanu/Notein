package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.OooO0O0;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f66169OooOo0o;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final LinkedHashMap f66168OooOo = new LinkedHashMap();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO0O0 f66171OooOoO0 = new OooO0O0();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final OooO00o f66170OooOoO = new OooO00o();

    public static final class OooO00o extends OooO0O0.OooO00o {
        public OooO00o() {
            attachInterface(this, androidx.room.OooO0O0.f66178OooO0Oo);
        }

        @Override // androidx.room.OooO0O0
        public final void OooOOOo(int i, String[] tables) {
            OooOOO0.OooO0oO(tables, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f66171OooOoO0) {
                String str = (String) multiInstanceInvalidationService.f66168OooOo.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.f66171OooOoO0.beginBroadcast();
                for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.f66171OooOoO0.getBroadcastCookie(i2);
                        OooOOO0.OooO0o0(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.f66168OooOo.get(num);
                        if (i != iIntValue && str.equals(str2)) {
                            try {
                                multiInstanceInvalidationService.f66171OooOoO0.getBroadcastItem(i2).OooO00o(tables);
                                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.f66171OooOoO0.finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.f66171OooOoO0.finishBroadcast();
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
            }
        }

        @Override // androidx.room.OooO0O0
        public final int OooOOo0(androidx.room.OooO00o callback, String str) {
            OooOOO0.OooO0oO(callback, "callback");
            int i = 0;
            if (str == null) {
                return 0;
            }
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f66171OooOoO0) {
                try {
                    int i2 = multiInstanceInvalidationService.f66169OooOo0o + 1;
                    multiInstanceInvalidationService.f66169OooOo0o = i2;
                    if (multiInstanceInvalidationService.f66171OooOoO0.register(callback, Integer.valueOf(i2))) {
                        multiInstanceInvalidationService.f66168OooOo.put(Integer.valueOf(i2), str);
                        i = i2;
                    } else {
                        multiInstanceInvalidationService.f66169OooOo0o--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i;
        }

        @Override // androidx.room.OooO0O0
        public final void OooOo00(androidx.room.OooO00o callback, int i) {
            OooOOO0.OooO0oO(callback, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f66171OooOoO0) {
                multiInstanceInvalidationService.f66171OooOoO0.unregister(callback);
            }
        }
    }

    public static final class OooO0O0 extends RemoteCallbackList<androidx.room.OooO00o> {
        public OooO0O0() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(IInterface iInterface, Object cookie) {
            androidx.room.OooO00o callback = (androidx.room.OooO00o) iInterface;
            OooOOO0.OooO0oO(callback, "callback");
            OooOOO0.OooO0oO(cookie, "cookie");
            MultiInstanceInvalidationService.this.f66168OooOo.remove((Integer) cookie);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        OooOOO0.OooO0oO(intent, "intent");
        return this.f66170OooOoO;
    }
}
