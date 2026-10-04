package o0oo0O;

import android.graphics.RectF;
import kotlin.jvm.internal.OooOOO0;
import o0o0OoOO.C30715Oooo00o;
import oO0o.C33532OooO0oO;
import oO0o.InterfaceC33531OooO0o0;
import oO0o.OooOO0O;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;
import oO0oO000.OooO0OO;

/* JADX INFO: renamed from: o0oo0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31219OooO0O0 implements InterfaceC33911OooO0OO<RectF> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C31219OooO0O0 f111342OooO00o = new C31219OooO0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C33532OooO0oO f111343OooO0O0 = OooOO0O.OooO0O0("RectF", new InterfaceC33531OooO0o0[0], new C30715Oooo00o(1));

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final Object deserialize(OooO0OO oooO0OO) {
        C33532OooO0oO c33532OooO0oO = f111343OooO0O0;
        oO0oO000.OooO00o OooO00o2 = oooO0OO.OooO00o(c33532OooO0oO);
        float fOooO0Oo = 0.0f;
        float fOooO0Oo2 = 0.0f;
        float fOooO0Oo3 = 0.0f;
        float fOooO0Oo4 = 0.0f;
        while (true) {
            int iOooOo0o = OooO00o2.OooOo0o(c33532OooO0oO);
            if (iOooOo0o == -1) {
                OooO00o2.OooO0O0(c33532OooO0oO);
                return new RectF(fOooO0Oo, fOooO0Oo2, fOooO0Oo3, fOooO0Oo4);
            }
            if (iOooOo0o == 0) {
                fOooO0Oo = OooO00o2.OooO0Oo(c33532OooO0oO, 0);
            } else if (iOooOo0o == 1) {
                fOooO0Oo2 = OooO00o2.OooO0Oo(c33532OooO0oO, 1);
            } else if (iOooOo0o == 2) {
                fOooO0Oo3 = OooO00o2.OooO0Oo(c33532OooO0oO, 2);
            } else {
                if (iOooOo0o != 3) {
                    throw new IllegalStateException(("Unexpected index: " + iOooOo0o).toString());
                }
                fOooO0Oo4 = OooO00o2.OooO0Oo(c33532OooO0oO, 3);
            }
        }
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return f111343OooO0O0;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
        RectF value = (RectF) obj;
        OooOOO0.OooO0oO(encoder, "encoder");
        OooOOO0.OooO0oO(value, "value");
        C33532OooO0oO c33532OooO0oO = f111343OooO0O0;
        oO0oO000.OooO0O0 oooO0O0OooO00o = encoder.OooO00o(c33532OooO0oO);
        oooO0O0OooO00o.OooOOo0(c33532OooO0oO, 0, value.left);
        oooO0O0OooO00o.OooOOo0(c33532OooO0oO, 1, value.top);
        oooO0O0OooO00o.OooOOo0(c33532OooO0oO, 2, value.right);
        oooO0O0OooO00o.OooOOo0(c33532OooO0oO, 3, value.bottom);
        oooO0O0OooO00o.OooO0O0(c33532OooO0oO);
    }
}
