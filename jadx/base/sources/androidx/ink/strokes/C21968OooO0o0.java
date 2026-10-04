package androidx.ink.strokes;

import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import kotlin.jvm.internal.C24019OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: androidx.ink.strokes.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21968OooO0o0 extends C24019OooOO0o implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f65472OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21968OooO0o0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.f65472OooOo0o = i3;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f65472OooOo0o) {
            case 0:
                ((InProgressStrokeNative) this.receiver).free(((Number) obj).longValue());
                break;
            default:
                int iIntValue = ((Number) obj).intValue();
                PenBoxChildFragment penBoxChildFragment = (PenBoxChildFragment) this.receiver;
                int i = PenBoxChildFragment.f75355o0000Ooo;
                penBoxChildFragment.Oooo0o().OooOOo0(true, Integer.valueOf(iIntValue));
                penBoxChildFragment.Oooooo(11, Integer.valueOf(iIntValue));
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
