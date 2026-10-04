package o0Ooo0oo;

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

/* JADX INFO: renamed from: o0Ooo0oo.o000O0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$updatePenWidthList$2", m80623f = "PenBarViewModel.kt", m80624l = {1084, EditingLanguage.KHMER}, m80625m = "invokeSuspend")
public final class C29540o000O0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104788OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104789OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f104790OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f104791OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ float f104792OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29540o000O0O0(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, int i, int i2, float f, Continuation<? super C29540o000O0O0> continuation) {
        super(2, continuation);
        this.f104788OooOo = oooO0O0;
        this.f104791OooOoO0 = i;
        this.f104790OooOoO = i2;
        this.f104792OooOoOO = f;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29540o000O0O0(this.f104788OooOo, this.f104791OooOoO0, this.f104790OooOoO, this.f104792OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29540o000O0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
    
        if (r5.f75143OooO0o0.OooO0O0(new com.orion.notein.domain.models.note.PenInfo[]{r2}, r18) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104789OooOo0o;
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f104788OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f104789OooOo0o = 1;
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
        for (PenInfo penInfo : (List) objOooO0o) {
            int type = penInfo.getType();
            int i2 = this.f104790OooOoO;
            if (type == i2) {
                ArrayList arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(penInfo.getWidthList());
                int i3 = this.f104791OooOoO0;
                if (i3 < 0 || i3 >= arrayListO0ooOoO.size()) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("PenBarViewModel");
                    c20358OooO00o.OooOO0O("updatePenWidthList skip: widthList size=%d, index=%d, type=%d", new Integer(arrayListO0ooOoO.size()), new Integer(i3), new Integer(i2));
                    return C32460OooOooO.f116667OooO00o;
                }
                arrayListO0ooOoO.set(i3, new Float(this.f104792OooOoOO));
                PenInfo penInfoCopy$default = penInfo.getNoteId() == null ? PenInfo.copy$default(penInfo, C24761OooO.OooO00o("toString(...)"), 0, 0, 0, null, arrayListO0ooOoO, (String) oooO0O0.f75162OooOoO0.f121747OooOo0o.getValue(), false, null, 414, null) : PenInfo.copy$default(penInfo, null, 0, 0, 0, null, arrayListO0ooOoO, null, false, null, 479, null);
                this.f104789OooOo0o = 2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
