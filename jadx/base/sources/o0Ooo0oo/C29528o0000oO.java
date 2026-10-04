package o0Ooo0oo;

import android.os.Bundle;
import com.aspose.words.EditingLanguage;
import com.orion.notein.domain.models.note.PenInfo;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Ooo0oo.o0000oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$saveLassoFilter$1", m80623f = "PenBarViewModel.kt", m80624l = {1129, EditingLanguage.SOMALI}, m80625m = "invokeSuspend")
public final class C29528o0000oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104738OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104739OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<String> f104740OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29528o0000oO(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, List<String> list, Continuation<? super C29528o0000oO> continuation) {
        super(2, continuation);
        this.f104738OooOo = oooO0O0;
        this.f104740OooOoO0 = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29528o0000oO(this.f104738OooOo, this.f104740OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29528o0000oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        if (r5.f75143OooO0o0.OooO0O0(new com.orion.notein.domain.models.note.PenInfo[]{r2}, r18) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104739OooOo0o;
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f104738OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f104739OooOo0o = 1;
            objOooO0o = com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.OooO0o(oooO0O0, this);
            if (objOooO0o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooO0o = obj;
        for (PenInfo penInfo : (Iterable) objOooO0o) {
            if (penInfo.getType() == 4) {
                Bundle bundleDeepCopy = penInfo.getExtra().deepCopy();
                bundleDeepCopy.putString("filter", oOo000Oo.OooOo.o000oOoO(this.f104740OooOoO0, ",", null, null, null, 62));
                PenInfo penInfoCopy$default = penInfo.getNoteId() == null ? PenInfo.copy$default(penInfo, C24761OooO.OooO00o("toString(...)"), 0, 0, 0, null, null, (String) oooO0O0.f75162OooOoO0.f121747OooOo0o.getValue(), false, bundleDeepCopy, 190, null) : PenInfo.copy$default(penInfo, null, 0, 0, 0, null, null, null, false, bundleDeepCopy, 255, null);
                this.f104739OooOo0o = 2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
