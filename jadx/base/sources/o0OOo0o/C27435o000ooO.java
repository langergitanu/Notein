package o0OOo0o;

import android.util.Log;
import com.aspose.words.EditingLanguage;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o000ooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$checkHasNoExtraInfoMetas$2", m80623f = "NoteUseCase.kt", m80624l = {2059, EditingLanguage.ITALIAN_SWITZERLAND}, m80625m = "invokeSuspend")
public final class C27435o000ooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Iterator f95825OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27449o00O0OoO f95826OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f95827OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f95828OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27435o000ooO(Continuation continuation, C27449o00O0OoO c27449o00O0OoO) {
        super(2, continuation);
        this.f95827OooOoO = c27449o00O0OoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27435o000ooO(continuation, this.f95827OooOoO);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27435o000ooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r8 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95828OooOoO0;
        C27449o00O0OoO c27449o00O0OoO = this.f95827OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o0OOO00o.OooO0O0 oooO0O0OooOo0o = c27449o00O0OoO.f96036OooO0O0.OooOo0o(c27449o00O0OoO.f96037OooO0OO.OooO0Oo());
            this.f95828OooOoO0 = 1;
            obj = C25252OooO0Oo.OooOOo(oooO0O0OooOo0o, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = this.f95825OooOo;
                C27449o00O0OoO c27449o00O0OoO2 = this.f95826OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c27449o00O0OoO = c27449o00O0OoO2;
                while (it.hasNext()) {
                    String id = ((NoteMeta) it.next()).getId();
                    this.f95826OooOo0o = c27449o00O0OoO;
                    this.f95825OooOo = it;
                    this.f95828OooOoO0 = 2;
                    if (C27449o00O0OoO.OooO00o(c27449o00O0OoO, id, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            NoteMeta noteMeta = (NoteMeta) obj2;
            if (noteMeta.getTnPath().length() == 0 || noteMeta.getTotalPagesCount() == 0) {
                arrayList.add(obj2);
            }
        }
        Log.d("NoteUseCase", "has no tnPath metas size: " + arrayList.size());
        it = arrayList.iterator();
        while (it.hasNext()) {
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
