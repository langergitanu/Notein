package o0Ooooo;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.page.Page;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.o00O00o0;
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

/* JADX INFO: renamed from: o0Ooooo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewViewModel$duplicatedPage$2", m80623f = "EditorPreviewViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_4_ACCENT_5}, m80625m = "invokeSuspend")
public final class C29677OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO f105213OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105214OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f105215OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29677OooOOOo(com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OO, String str, Continuation<? super C29677OooOOOo> continuation) {
        super(2, continuation);
        this.f105213OooOo = oooO0OO;
        this.f105215OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29677OooOOOo(this.f105213OooOo, this.f105215OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29677OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105214OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OO = this.f105213OooOo;
            Iterator it = ((List) oooO0OO.f76077OooOOOo.f121747OooOo0o.getValue()).iterator();
            int i2 = 0;
            while (true) {
                boolean zHasNext = it.hasNext();
                str = this.f105215OooOoO0;
                if (!zHasNext) {
                    i2 = -1;
                    break;
                }
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((Page) it.next()).getId(), str)) {
                    break;
                }
                i2++;
            }
            int i3 = i2;
            if (i3 < 0) {
                return C32460OooOooO.f116667OooO00o;
            }
            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(str);
            String str2 = (String) oooO0OO.f76075OooOOO0.getValue();
            this.f105214OooOo0o = 1;
            C27449o00O0OoO c27449o00O0OoO = oooO0OO.f76066OooO0Oo;
            c27449o00O0OoO.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00O00o0(c27449o00O0OoO, str2, listOooO0oO, i3, null), this);
            if (objOooO0o != EnumC32485OooO00o.f116726OooOo0o) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
