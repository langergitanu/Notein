package o0Ooo0oo;

import com.aspose.words.EditingLanguage;
import com.orion.notein.domain.models.note.PenInfo;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
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

/* JADX INFO: renamed from: o0Ooo0oo.o0000O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$saveSelectedPenWidth$2", m80623f = "PenBarViewModel.kt", m80624l = {EditingLanguage.KONKANI, EditingLanguage.FILIPINO}, m80625m = "invokeSuspend")
public final class C29512o0000O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104679OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104680OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ PenWidthVO f104681OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29512o0000O(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, PenWidthVO penWidthVO, Continuation<? super C29512o0000O> continuation) {
        super(2, continuation);
        this.f104679OooOo = oooO0O0;
        this.f104681OooOoO0 = penWidthVO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29512o0000O(this.f104679OooOo, this.f104681OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29512o0000O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
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
        int i = this.f104680OooOo0o;
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f104679OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f104680OooOo0o = 1;
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
            PenWidthVO penWidthVO = this.f104681OooOoO0;
            if (type == penWidthVO.getType()) {
                PenInfo penInfoCopy$default = penInfo.getNoteId() == null ? PenInfo.copy$default(penInfo, C24761OooO.OooO00o("toString(...)"), 0, 0, penWidthVO.getIndex(), null, null, (String) oooO0O0.f75162OooOoO0.f121747OooOo0o.getValue(), false, null, 438, null) : PenInfo.copy$default(penInfo, null, 0, 0, penWidthVO.getIndex(), null, null, null, false, null, 503, null);
                this.f104680OooOo0o = 2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
