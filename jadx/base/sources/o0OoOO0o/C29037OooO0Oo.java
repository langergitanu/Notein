package o0OoOO0o;

import com.orion.notein.domain.models.papertheme.MyTemplate;
import kotlin.coroutines.Continuation;
import o0OOOO00.C27095OooOo0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoOO0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.dialog.TemplateRenameDialogViewModel$renameTemplate$2", m80623f = "TemplateRenameDialogViewModel.kt", m80624l = {21, 24}, m80625m = "invokeSuspend")
public final class C29037OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C29038OooO0o0 f102860OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102861OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f102862OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f102863OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29037OooO0Oo(C29038OooO0o0 c29038OooO0o0, String str, String str2, Continuation<? super C29037OooO0Oo> continuation) {
        super(2, continuation);
        this.f102860OooOo = c29038OooO0o0;
        this.f102863OooOoO0 = str;
        this.f102862OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29037OooO0Oo(this.f102860OooOo, this.f102863OooOoO0, this.f102862OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29037OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r6.OooOOo(r2, r18) == r1) goto L19;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooOO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102861OooOo0o;
        String str = this.f102863OooOoO0;
        C29038OooO0o0 c29038OooO0o0 = this.f102860OooOo;
        C27095OooOo0O c27095OooOo0O = c29038OooO0o0.f102864OooO0Oo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f102861OooOo0o = 1;
            objOooOO0o = c27095OooOo0O.OooOO0o(str, this);
            if (objOooOO0o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            c29038OooO0o0.f102865OooO0o0.OooO0o(str);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooOO0o = obj;
        MyTemplate myTemplate = (MyTemplate) objOooOO0o;
        if (myTemplate == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        MyTemplate myTemplateCopy$default = MyTemplate.copy$default(myTemplate, null, null, null, 0L, 0L, this.f102862OooOoO, 31, null);
        this.f102861OooOo0o = 2;
    }
}
