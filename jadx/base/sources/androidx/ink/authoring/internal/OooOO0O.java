package androidx.ink.authoring.internal;

import android.graphics.Matrix;
import androidx.ink.authoring.internal.OooOO0;
import androidx.ink.geometry.BoxAccumulator;
import androidx.ink.geometry.MutableBox;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C24019OooOO0o;
import o000O0oo.C24417OooO0O0;
import o000O0oo.InterfaceC24435OooOoO0;
import oO00ooO.C32460OooOooO;
import oOo000Oo.C34426OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24417OooO0O0 f65320OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f65322OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC24435OooOoO0<Object, o000O0oO.OooO0O0<Object, Object>> f65323OooO0Oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final MutableBox f65328OooOO0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LinkedHashMap f65321OooO0O0 = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C34426OooOO0o<o000O.OooO00o> f65325OooO0o0 = new C34426OooOO0o<>(30);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Matrix f65324OooO0o = new Matrix();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Matrix f65326OooO0oO = new Matrix();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList<OooOO0.OooO00o> f65327OooO0oo = new ArrayList<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final BoxAccumulator f65319OooO = new BoxAccumulator();

    public static final /* synthetic */ class OooO00o extends C24019OooOO0o implements oO0O000o.OooO00o<C32460OooOooO> {
        @Override // oO0O000o.OooO00o
        public final C32460OooOooO invoke() {
            ((OooOO0) this.receiver).OooOOo0(OooOO0.C21943OooO0Oo.f65284OooO00o);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public OooOO0O(OooOO0<Object, o000O0oO.OooO0O0<Object, Object>, Object> oooOO02, InterfaceC24435OooOoO0<Object, o000O0oO.OooO0O0<Object, Object>> interfaceC24435OooOoO0) {
        this.f65320OooO00o = new C24417OooO0O0(new OooO00o(0, oooOO02, OooOO0.class, "queueAnimationFrameAction", "queueAnimationFrameAction()V", 0));
        this.f65323OooO0Oo = interfaceC24435OooOoO0;
        new BoxAccumulator();
        this.f65328OooOO0 = new MutableBox();
    }
}
