package o0o000oo;

import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0o00Oo0.C29909OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ToolbarViewModel$toolbarSettingsItems$1", m80623f = "ToolbarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o00Oo0 extends AbstractC32476OooO implements InterfaceC32509OooOOo<NoteMeta, List<? extends C29909OooO0O0>, Boolean, Continuation<? super List<? extends C29909OooO0O0>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f105919OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ NoteMeta f105920OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f105921OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ boolean f105922OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(o00Ooo o00ooo2, Continuation<? super o00Oo0> continuation) {
        super(4, continuation);
        this.f105921OooOoO = o00ooo2;
    }

    @Override // oO0O000o.InterfaceC32509OooOOo
    public final Object invoke(NoteMeta noteMeta, List<? extends C29909OooO0O0> list, Boolean bool, Continuation<? super List<? extends C29909OooO0O0>> continuation) {
        boolean zBooleanValue = bool.booleanValue();
        o00Oo0 o00oo02 = new o00Oo0(this.f105921OooOoO, continuation);
        o00oo02.f105920OooOo0o = noteMeta;
        o00oo02.f105919OooOo = list;
        o00oo02.f105922OooOoO0 = zBooleanValue;
        return o00oo02.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        NoteMeta noteMeta = this.f105920OooOo0o;
        List list = this.f105919OooOo;
        boolean z = this.f105922OooOoO0;
        if (noteMeta == null) {
            return C34434OooOoO.f123453OooOo0o;
        }
        ArrayList arrayListOooO0o0 = o00Ooo.OooO0o0(this.f105921OooOoO, list);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : arrayListOooO0o0) {
            C29909OooO0O0 c29909OooO0O0 = (C29909OooO0O0) obj2;
            if (z || c29909OooO0O0.f106118OooO00o != 10) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
