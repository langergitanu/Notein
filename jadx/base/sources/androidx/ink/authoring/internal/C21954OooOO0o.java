package androidx.ink.authoring.internal;

import androidx.ink.authoring.internal.OooOO0;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C24019OooOO0o;
import o000O0oo.C24417OooO0O0;
import o000O0oo.C24431OooOo0;
import o000O0oo.Oooo000;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: androidx.ink.authoring.internal.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21954OooOO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final AtomicBoolean f65329OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24417OooO0O0 f65330OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentLinkedQueue<C24431OooOo0<Object>> f65331OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ConcurrentLinkedQueue<OooOO0.OooO00o> f65332OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0.OooO0OO f65333OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ConcurrentLinkedQueue<o000O.OooO00o> f65334OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Oooo000 f65335OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AtomicBoolean f65336OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOO0.C19025OooOO0 f65337OooO0oo;

    /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooOO0o$OooO00o */
    public static final /* synthetic */ class OooO00o extends C24019OooOO0o implements oO0O000o.OooO00o<C32460OooOooO> {
        @Override // oO0O000o.OooO00o
        public final C32460OooOooO invoke() {
            OooOO0 oooOO02 = (OooOO0) this.receiver;
            OooOO0.OooO0o oooO0oOooO0Oo = oooOO02.OooO0Oo();
            if (oooO0oOooO0Oo instanceof OooOO0.C21946OooO0oo) {
                oooOO02.OooO(((OooOO0.C21946OooO0oo) oooO0oOooO0Oo).f65291OooO00o);
            } else if (oooO0oOooO0Oo instanceof OooOO0.OooOOO0) {
                oooOO02.OooOOOo();
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C21954OooOO0o(OooOO0<Object, o000O0oO.OooO0O0<Object, Object>, Object> oooOO02) {
        new AtomicBoolean(false);
        this.f65330OooO00o = new C24417OooO0O0(new OooO00o(0, oooOO02, OooOO0.class, "onEndOfStrokeCohortCheck", "onEndOfStrokeCohortCheck()V", 0));
        this.f65331OooO0O0 = new ConcurrentLinkedQueue<>();
        this.f65332OooO0OO = new ConcurrentLinkedQueue<>();
        this.f65333OooO0Oo = new OooOO0.OooO0OO();
        this.f65335OooO0o0 = new Oooo000(0);
        this.f65334OooO0o = new ConcurrentLinkedQueue<>();
        this.f65336OooO0oO = new AtomicBoolean(false);
        this.f65337OooO0oo = new OooOO0.C19025OooOO0();
        this.f65329OooO = new AtomicBoolean(false);
    }
}
