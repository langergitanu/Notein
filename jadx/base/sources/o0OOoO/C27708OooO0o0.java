package o0OOoO;

import com.aspose.words.StyleIdentifier;
import com.facebook.soloader.OooOo;
import com.orion.notein.domain.models.note.Comment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO00o0.C26479OooOO0o;
import o0OO00o0.OooO;
import o0OO00o0.OooOo00;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOoO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.comment.CommentUseCase$updateComment$2", m80623f = "CommentUseCase.kt", m80624l = {93, 99, 103, 104}, m80625m = "invokeSuspend")
public final class C27708OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f97712OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Comment f97713OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f97714OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27710OooO0oo f97715OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f97716OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f97717OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27708OooO0o0(C27710OooO0oo c27710OooO0oo, String str, String str2, String str3, Continuation<? super C27708OooO0o0> continuation) {
        super(2, continuation);
        this.f97715OooOoO0 = c27710OooO0oo;
        this.f97714OooOoO = str;
        this.f97716OooOoOO = str2;
        this.f97717OooOoo0 = str3;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27708OooO0o0(this.f97715OooOoO0, this.f97714OooOoO, this.f97716OooOoOO, this.f97717OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27708OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
    
        if (r8.OooO0o0(r3, r23) != r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098 A[LOOP:0: B:26:0x0092->B:28:0x0098, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0OO;
        Comment commentCopy$default;
        Iterator it;
        Object objOooO00o;
        EnumC32485OooO00o enumC32485OooO00o;
        EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f97712OooOo;
        String str = this.f97716OooOoOO;
        C27710OooO0oo c27710OooO0oo = this.f97715OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            OooOo00 oooOo00 = c27710OooO0oo.f97721OooO00o;
            this.f97712OooOo = 1;
            objOooO0OO = oooOo00.OooO0OO(this.f97714OooOoO, str, this);
            if (objOooO0OO != enumC32485OooO00o2) {
            }
            return enumC32485OooO00o2;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            objOooO0OO = obj;
        } else {
            if (i == 2) {
                commentCopy$default = this.f97713OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                OooOo00 oooOo002 = c27710OooO0oo.f97721OooO00o;
                List listOooO0oO = OooOo.OooO0oO(commentCopy$default);
                this.f97713OooOo0o = null;
                this.f97712OooOo = 3;
                List list = listOooO0oO;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(oooOo002.f91043OooO0OO.toEntity(Comment.copy$default((Comment) it.next(), null, null, null, null, null, 0L, System.currentTimeMillis(), null, 191, null)));
                }
                C26479OooOO0o c26479OooOO0o = oooOo002.f91041OooO00o;
                c26479OooOO0o.getClass();
                objOooO00o = c26479OooOO0o.OooO00o(str, new OooO(arrayList, null));
                enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                if (objOooO00o != enumC32485OooO00o) {
                    objOooO00o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO00o != enumC32485OooO00o) {
                    objOooO00o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO00o != enumC32485OooO00o2) {
                    this.f97712OooOo = 4;
                }
                return enumC32485OooO00o2;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            this.f97712OooOo = 4;
        }
        String str2 = this.f97717OooOoo0;
        commentCopy$default = Comment.copy$default((Comment) objOooO0OO, null, str2, null, null, null, 0L, 0L, null, StyleIdentifier.MEDIUM_GRID_1_ACCENT_6, null);
        String quoteId = commentCopy$default.getQuoteId();
        if (quoteId != null && !C33599OooOo0O.Oooo0o0(quoteId)) {
            this.f97713OooOo0o = commentCopy$default;
            this.f97712OooOo = 2;
            if (C27710OooO0oo.OooO00o(c27710OooO0oo, quoteId, str2, str, this) != enumC32485OooO00o2) {
            }
            return enumC32485OooO00o2;
        }
        OooOo00 oooOo0022 = c27710OooO0oo.f97721OooO00o;
        List listOooO0oO2 = OooOo.OooO0oO(commentCopy$default);
        this.f97713OooOo0o = null;
        this.f97712OooOo = 3;
        List list2 = listOooO0oO2;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        it = list2.iterator();
        while (it.hasNext()) {
        }
        C26479OooOO0o c26479OooOO0o2 = oooOo0022.f91041OooO00o;
        c26479OooOO0o2.getClass();
        objOooO00o = c26479OooOO0o2.OooO00o(str, new OooO(arrayList2, null));
        enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
        }
        if (objOooO00o != enumC32485OooO00o) {
        }
        if (objOooO00o != enumC32485OooO00o2) {
        }
        return enumC32485OooO00o2;
    }
}
