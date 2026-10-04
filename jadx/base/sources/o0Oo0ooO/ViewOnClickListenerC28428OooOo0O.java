package o0Oo0ooO;

import android.view.View;
import com.orion.notein.p607ui.label.OooO0o;
import com.orion.notein.p607ui.p609vo.ThemeVO;
import o0o0OOO.C30465OooO0oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0Oo0ooO.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28428OooOo0O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100780OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100781OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f100782OooOoO0;

    public /* synthetic */ ViewOnClickListenerC28428OooOo0O(int i, Object obj, Object obj2) {
        this.f100781OooOo0o = i;
        this.f100780OooOo = obj;
        this.f100782OooOoO0 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f100781OooOo0o) {
            case 0:
                OooO0o.OooO0O0 oooO0O0 = (OooO0o.OooO0O0) this.f100780OooOo;
                String string = oooO0O0.f71995OooO00o.getText().toString();
                int i = oooO0O0.f72003OooOO0;
                if (i < 0) {
                    i = 0;
                }
                ((com.orion.notein.p607ui.label.OooO0o) this.f100782OooOoO0).f71993OooO0O0.OooO0o(i, string);
                break;
            default:
                InterfaceC32508OooOOOo<? super View, ? super ThemeVO, C32460OooOooO> interfaceC32508OooOOOo = ((C30465OooO0oo) this.f100780OooOo).f108792OooO0o;
                if (interfaceC32508OooOOOo != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    interfaceC32508OooOOOo.invoke(view, (ThemeVO) this.f100782OooOoO0);
                }
                break;
        }
    }
}
