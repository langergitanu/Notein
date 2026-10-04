package o0OO;

import com.orion.notein.data.p602db.entity.NoteContentEntity;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.o00O0O00;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.note.NoteContentLocalDataSource$updateOldNoteId$2", m80623f = "NoteContentLocalDataSource.kt", m80624l = {95, 97}, m80625m = "invokeSuspend")
public final class OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<o00O0O00, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f90662OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90663OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f90664OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f90665OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(String str, String str2, Continuation<? super OooOOO0> continuation) {
        super(2, continuation);
        this.f90665OooOoO0 = str;
        this.f90664OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooOOO0 oooOOO0 = new OooOOO0(this.f90665OooOoO0, this.f90664OooOoO, continuation);
        oooOOO0.f90662OooOo = obj;
        return oooOOO0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(o00O0O00 o00o0o002, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOOO0) create(o00o0o002, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (r2.OooO0o(r5, r26) == r1) goto L17;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o00O0O00 o00o0o002;
        Object objOooO0OO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90663OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o00o0o002 = (o00O0O00) this.f90662OooOo;
            this.f90662OooOo = o00o0o002;
            this.f90663OooOo0o = 1;
            objOooO0OO = o00o0o002.OooO0OO(this.f90665OooOoO0, this);
            if (objOooO0OO != enumC32485OooO00o) {
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
        o00o0o002 = (o00O0O00) this.f90662OooOo;
        C32446OooOOOo.OooO0O0(obj);
        objOooO0OO = obj;
        NoteContentEntity noteContentEntity = (NoteContentEntity) objOooO0OO;
        if (noteContentEntity == null) {
            return null;
        }
        NoteContentEntity[] noteContentEntityArr = {noteContentEntity.copy((65534 & 1) != 0 ? noteContentEntity.id : this.f90664OooOoO, (65534 & 2) != 0 ? noteContentEntity.pageListJson : null, (65534 & 4) != 0 ? noteContentEntity.pageLayerListJson : null, (65534 & 8) != 0 ? noteContentEntity.outlines : null, (65534 & 16) != 0 ? noteContentEntity.defaultPageId : null, (65534 & 32) != 0 ? noteContentEntity.pdfInfoId : null, (65534 & 64) != 0 ? noteContentEntity.savedPageIndex : 0, (65534 & 128) != 0 ? noteContentEntity.activatedPageLayerId : null, (65534 & 256) != 0 ? noteContentEntity.zoom : 0.0f, (65534 & 512) != 0 ? noteContentEntity.unboundedPageOffsetX : 0.0f, (65534 & 1024) != 0 ? noteContentEntity.unboundedPageOffsetY : 0.0f, (65534 & 2048) != 0 ? noteContentEntity.pageOffSet : null, (65534 & 4096) != 0 ? noteContentEntity.unboundedNote : false, (65534 & 8192) != 0 ? noteContentEntity.creationTime : 0L, (65534 & 16384) != 0 ? noteContentEntity.lastModificationTime : 0L, (65534 & 32768) != 0 ? noteContentEntity.extrasJson : null)};
        this.f90662OooOo = null;
        this.f90663OooOo0o = 2;
    }
}
