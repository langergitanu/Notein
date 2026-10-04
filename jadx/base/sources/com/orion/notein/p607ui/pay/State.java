package com.orion.notein.p607ui.pay;

import androidx.core.app.NotificationCompat;
import com.orion.notein.p607ui.pay.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32442OooOO0o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/ui/pay/State;", "", "<init>", "()V", "Lcom/orion/notein/ui/pay/Event;", NotificationCompat.CATEGORY_EVENT, "nextState", "(Lcom/orion/notein/ui/pay/Event;)Lcom/orion/notein/ui/pay/State;", "Companion", "OooO00o", "OooO0O0", "OooO0o0", "OooO0o", "OooO0oO", "OooO0oo", "OooO0Oo", "OooO0OO", "Lcom/orion/notein/ui/pay/State$OooO0O0;", "Lcom/orion/notein/ui/pay/State$OooO0OO;", "Lcom/orion/notein/ui/pay/State$OooO0Oo;", "Lcom/orion/notein/ui/pay/State$OooO0o0;", "Lcom/orion/notein/ui/pay/State$OooO0o;", "Lcom/orion/notein/ui/pay/State$OooO0oO;", "Lcom/orion/notein/ui/pay/State$OooO0oo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class State {
    private static final String TAG = "State";

    public static final class OooO0O0 extends State {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f78711OooO00o = new OooO0O0(null);
    }

    public static final class OooO0OO extends State {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0OO f78712OooO00o = new OooO0OO(null);
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pay.State$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23767OooO0Oo extends State {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C23767OooO0Oo f78713OooO00o = new C23767OooO0Oo(null);
    }

    public static final class OooO0o extends State {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0o f78714OooO00o = new OooO0o(null);
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pay.State$OooO0o0, reason: case insensitive filesystem */
    public static final class C23768OooO0o0 extends State {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C23768OooO0o0 f78715OooO00o = new C23768OooO0o0(null);
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pay.State$OooO0oO, reason: case insensitive filesystem */
    public static final class C23769OooO0oO extends State {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C23769OooO0oO f78716OooO00o = new C23769OooO0oO(null);
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pay.State$OooO0oo, reason: case insensitive filesystem */
    public static final class C23770OooO0oo extends State {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C23770OooO0oo f78717OooO00o = new C23770OooO0oo(null);
    }

    public /* synthetic */ State(C24018OooO0oo c24018OooO0oo) {
        this();
    }

    public final State nextState(Event event) {
        OooOOO0.OooO0oO(event, "event");
        if (equals(OooO0O0.f78711OooO00o)) {
            if (event.equals(Event.C23765OooO0oO.f78709OooO00o)) {
                return C23768OooO0o0.f78715OooO00o;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0(TAG);
            c20358OooO00o.OooO0OO("invalid event: " + event, new Object[0]);
            return null;
        }
        C23768OooO0o0 c23768OooO0o0 = C23768OooO0o0.f78715OooO00o;
        if (equals(c23768OooO0o0)) {
            if (event.equals(Event.C23763OooO0Oo.f78706OooO00o)) {
                return OooO0o.f78714OooO00o;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0(TAG);
            c20358OooO00o2.OooO0OO("invalid event: " + event, new Object[0]);
            return null;
        }
        OooO0o oooO0o = OooO0o.f78714OooO00o;
        if (equals(oooO0o)) {
            if (event.equals(Event.OooO0o.f78707OooO00o)) {
                return C23769OooO0oO.f78716OooO00o;
            }
            if (event.equals(Event.C23764OooO0o0.f78708OooO00o)) {
                return OooO0OO.f78712OooO00o;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0(TAG);
            c20358OooO00o3.OooO0OO("invalid event: " + event, new Object[0]);
            return null;
        }
        if (equals(C23769OooO0oO.f78716OooO00o)) {
            if (event.equals(Event.OooO0OO.f78705OooO00o)) {
                return C23770OooO0oo.f78717OooO00o;
            }
            if (event.equals(Event.OooO0O0.f78704OooO00o)) {
                return OooO0OO.f78712OooO00o;
            }
            if (event.equals(Event.OooO00o.f78703OooO00o)) {
                return c23768OooO0o0;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0(TAG);
            c20358OooO00o4.OooO0OO("invalid event: " + event, new Object[0]);
            return null;
        }
        if (equals(C23770OooO0oo.f78717OooO00o)) {
            if (event.equals(Event.OooO.f78702OooO00o)) {
                return C23767OooO0Oo.f78713OooO00o;
            }
            if (event.equals(Event.C23766OooO0oo.f78710OooO00o)) {
                return OooO0OO.f78712OooO00o;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o5.OooOOO0(TAG);
            c20358OooO00o5.OooO0OO("invalid event: " + event, new Object[0]);
            return null;
        }
        if (equals(C23767OooO0Oo.f78713OooO00o)) {
            return null;
        }
        if (!equals(OooO0OO.f78712OooO00o)) {
            throw new C32442OooOO0o();
        }
        if (event.equals(Event.C23763OooO0Oo.f78706OooO00o)) {
            return oooO0o;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o6.OooOOO0(TAG);
        c20358OooO00o6.OooO0OO("invalid event: " + event, new Object[0]);
        return null;
    }

    private State() {
    }
}
