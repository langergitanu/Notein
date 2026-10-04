package com.orion.notein.p607ui.noteeditor.addtext;

import androidx.core.os.BundleKt;
import com.orion.notein.p607ui.noteeditor.addtext.OooO0OO;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o0oOoOo.C31039OooOO0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.ImportFontDialogFragment$importSelectedFont$1", m80623f = "ImportFontDialogFragment.kt", m80624l = {244}, m80625m = "invokeSuspend")
public final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Iterator f74010OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ImportFontDialogFragment f74011OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ ImportFontDialogFragment f74012OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f74013OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(ImportFontDialogFragment importFontDialogFragment, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f74012OooOoO = importFontDialogFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0O0(this.f74012OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0076 -> B:20:0x0079). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterator it;
        ImportFontDialogFragment importFontDialogFragment;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f74013OooOoO0;
        ImportFontDialogFragment importFontDialogFragment2 = this.f74012OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Iterable iterable = (Iterable) importFontDialogFragment2.OooOoo().f74021OooOO0O.f121747OooOo0o.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (((C31039OooOO0O) obj2).f110820OooO0o0) {
                    arrayList.add(obj2);
                }
            }
            it = arrayList.iterator();
            importFontDialogFragment = importFontDialogFragment2;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f74010OooOo;
            importFontDialogFragment = this.f74011OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            OooO0OO.OooO00o oooO00o = (OooO0OO.OooO00o) obj;
            if (oooO00o.f74023OooO00o != 0) {
                ImportFontDialogFragment.OooOoo0(importFontDialogFragment, oooO00o);
                return C32460OooOooO.f116667OooO00o;
            }
            if (it.hasNext()) {
                C31039OooOO0O c31039OooOO0O = (C31039OooOO0O) it.next();
                OooO0OO oooO0OOOooOoo = importFontDialogFragment.OooOoo();
                String str = c31039OooOO0O.f110816OooO00o;
                this.f74011OooOo0o = importFontDialogFragment;
                this.f74010OooOo = it;
                this.f74013OooOoO0 = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C23380OooO0o0(oooO0OOOooOoo, str, null), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                OooO0OO.OooO00o oooO00o2 = (OooO0OO.OooO00o) obj;
                if (oooO00o2.f74023OooO00o != 0) {
                }
                if (it.hasNext()) {
                    importFontDialogFragment2.requireActivity().getSupportFragmentManager().OooooOo(BundleKt.bundleOf(), "import_font_done");
                    importFontDialogFragment2.dismissAllowingStateLoss();
                    return C32460OooOooO.f116667OooO00o;
                }
            }
        }
    }
}
