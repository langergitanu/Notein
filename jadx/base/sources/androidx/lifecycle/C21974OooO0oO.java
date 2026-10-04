package androidx.lifecycle;

import androidx.lifecycle.AbstractC21979OooOOo0;

/* JADX INFO: renamed from: androidx.lifecycle.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21974OooO0oO implements InterfaceC21986OooOoOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC21986OooOoOO f65515OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO0o f65516OooOo0o;

    /* JADX INFO: renamed from: androidx.lifecycle.OooO0oO$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f65517OooO00o;

        static {
            int[] iArr = new int[AbstractC21979OooOOo0.OooO00o.values().length];
            try {
                iArr[AbstractC21979OooOOo0.OooO00o.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC21979OooOOo0.OooO00o.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC21979OooOOo0.OooO00o.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC21979OooOOo0.OooO00o.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC21979OooOOo0.OooO00o.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC21979OooOOo0.OooO00o.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC21979OooOOo0.OooO00o.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f65517OooO00o = iArr;
        }
    }

    public C21974OooO0oO(OooO0o defaultLifecycleObserver, InterfaceC21986OooOoOO interfaceC21986OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f65516OooOo0o = defaultLifecycleObserver;
        this.f65515OooOo = interfaceC21986OooOoOO;
    }

    @Override // androidx.lifecycle.InterfaceC21986OooOoOO
    public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
        int i = OooO00o.f65517OooO00o[oooO00o.ordinal()];
        OooO0o oooO0o = this.f65516OooOo0o;
        switch (i) {
            case 1:
                oooO0o.getClass();
                break;
            case 2:
                oooO0o.onStart(interfaceC21987OooOoo);
                break;
            case 3:
                oooO0o.OooOOoo(interfaceC21987OooOoo);
                break;
            case 4:
                oooO0o.OooOooo(interfaceC21987OooOoo);
                break;
            case 5:
                oooO0o.onStop(interfaceC21987OooOoo);
                break;
            case 6:
                oooO0o.onDestroy(interfaceC21987OooOoo);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC21986OooOoOO interfaceC21986OooOoOO = this.f65515OooOo;
        if (interfaceC21986OooOoOO != null) {
            interfaceC21986OooOoOO.OooOOo0(interfaceC21987OooOoo, oooO00o);
        }
    }
}
