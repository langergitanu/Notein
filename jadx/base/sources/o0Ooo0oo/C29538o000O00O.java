package o0Ooo0oo;

import Oooo0.C20855OooooOO;
import com.aspose.words.EditingLanguage;
import com.orion.notein.domain.models.note.PenInfo;
import java.util.ArrayList;
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
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Ooo0oo.o000O00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$updatePenColorList$2", m80623f = "PenBarViewModel.kt", m80624l = {EditingLanguage.BELARUSIAN, EditingLanguage.FAEROESE}, m80625m = "invokeSuspend")
public final class C29538o000O00O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f104780OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104781OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f104782OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104783OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ int f104784OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29538o000O00O(int i, com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, int i2, int i3, Continuation<? super C29538o000O00O> continuation) {
        super(2, continuation);
        this.f104780OooOo = i;
        this.f104783OooOoO0 = oooO0O0;
        this.f104782OooOoO = i2;
        this.f104784OooOoOO = i3;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29538o000O00O(this.f104780OooOo, this.f104783OooOoO0, this.f104782OooOoO, this.f104784OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29538o000O00O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d8, code lost:
    
        if (r7.f75143OooO0o0.OooO0O0(new com.orion.notein.domain.models.note.PenInfo[]{r2}, r21) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104781OooOo0o;
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f104783OooOoO0;
        int i2 = this.f104780OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (i2 >= 0) {
                this.f104781OooOo0o = 1;
                objOooO0o = com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.OooO0o(oooO0O0, this);
                if (objOooO0o != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PenBarViewModel");
            c20358OooO00o.OooOO0O("updatePenColorList: Invalid index " + i2 + ", skipping update", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
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
        for (PenInfo penInfo : (List) objOooO0o) {
            if (penInfo.getType() == this.f104784OooOoOO) {
                ArrayList arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(penInfo.getColorList());
                if (i2 < 0 || i2 >= arrayListO0ooOoO.size()) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("PenBarViewModel");
                    c20358OooO00o2.OooO0OO(C20855OooooOO.OooO0OO(i2, arrayListO0ooOoO.size(), "updatePenColorList: index ", " is out of bounds for colorList size "), new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                arrayListO0ooOoO.set(i2, new Integer(this.f104782OooOoO));
                PenInfo penInfoCopy$default = penInfo.getNoteId() == null ? PenInfo.copy$default(penInfo, C24761OooO.OooO00o("toString(...)"), 0, 0, 0, arrayListO0ooOoO, null, (String) oooO0O0.f75162OooOoO0.f121747OooOo0o.getValue(), false, null, 430, null) : PenInfo.copy$default(penInfo, null, 0, 0, 0, arrayListO0ooOoO, null, null, false, null, 495, null);
                this.f104781OooOo0o = 2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
