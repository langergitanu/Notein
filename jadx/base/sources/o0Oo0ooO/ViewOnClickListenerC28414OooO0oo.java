package o0Oo0ooO;

import android.view.View;
import android.widget.ImageView;
import com.orion.notein.p607ui.label.OooO0OO;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C30012Oooo0o;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0Oo0ooO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28414OooO0oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100719OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100720OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f100721OooOoO0;

    public /* synthetic */ ViewOnClickListenerC28414OooO0oo(int i, Object obj, Object obj2) {
        this.f100720OooOo0o = i;
        this.f100719OooOo = obj;
        this.f100721OooOoO0 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PenBox.InterfaceC23606OooO0o0 interfaceC23606OooO0o0;
        switch (this.f100720OooOo0o) {
            case 0:
                OooO0OO.OooO00o oooO00o = (OooO0OO.OooO00o) this.f100719OooOo;
                int i = oooO00o.f71973OooO;
                Integer numValueOf = Integer.valueOf(i);
                if (i < 0) {
                    numValueOf = null;
                }
                int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                OooO0OO.InterfaceC19211OooO0OO interfaceC19211OooO0OO = ((com.orion.notein.p607ui.label.OooO0OO) this.f100721OooOoO0).f71972OooO0O0;
                if (interfaceC19211OooO0OO != null) {
                    interfaceC19211OooO0OO.OooO0o0(iIntValue, oooO00o.f71974OooO00o.getText().toString());
                }
                break;
            default:
                C30012Oooo0o c30012Oooo0o = (C30012Oooo0o) this.f100719OooOo;
                c30012Oooo0o.getClass();
                ((ImageView) this.f100721OooOoO0).setActivated(!r0.isActivated());
                Map mapOooO0oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO(c30012Oooo0o.f106660OooOoo0, "shape"), new C32443OooOOO(c30012Oooo0o.f106661OooOooO, "text"), new C32443OooOOO(c30012Oooo0o.f106664Oooo000, "image"));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapOooO0oo.entrySet()) {
                    if (((ImageView) entry.getKey()).isActivated()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                List<String> listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(linkedHashMap.values());
                C29936OooO0oO c29936OooO0oO = c30012Oooo0o.f106668Oooo0OO;
                if (c29936OooO0oO != null && (interfaceC23606OooO0o0 = c29936OooO0oO.f106288OooO0oO) != null) {
                    interfaceC23606OooO0o0.OooO0OO(listO0ooOO0);
                    break;
                }
                break;
        }
    }
}
