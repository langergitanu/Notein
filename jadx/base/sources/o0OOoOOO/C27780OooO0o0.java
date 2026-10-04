package o0OOoOOO;

import Oooo0oO.o0Oo0oo;
import androidx.core.app.OooO;
import com.orion.notein.domain.models.folder.Folder;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOoooO.C28009OooOOOO;
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
import oOO00oo.C34406OooO00o;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0OOoOOO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.folder.RecoverDetachedFoldersUseCase$invoke$2", m80623f = "RecoverDetachedFoldersUseCase.kt", m80624l = {40, 49, 62}, m80625m = "invokeSuspend")
public final class C27780OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Integer>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C27782OooO0oo f98130OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public List f98131OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f98132OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f98133OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27782OooO0oo f98134OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27780OooO0o0(C27782OooO0oo c27782OooO0oo, Continuation<? super C27780OooO0o0> continuation) {
        super(2, continuation);
        this.f98134OooOoOO = c27782OooO0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27780OooO0o0(this.f98134OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Integer> continuation) {
        return ((C27780OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        if (r15 == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterator it;
        List list;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98132OooOoO;
        C27782OooO0oo c27782OooO0oo = this.f98134OooOoOO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String strOooO0Oo = c27782OooO0oo.f98145OooO0OO.OooO0Oo();
            C28009OooOOOO c28009OooOOOO = c27782OooO0oo.f98143OooO00o;
            this.f98132OooOoO = 1;
            obj = c28009OooOOOO.OooO0OO(strOooO0Oo, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i == 2) {
                C32446OooOOOo.OooO0O0(obj);
                List list2 = (List) obj;
                if (list2.isEmpty()) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("RecoverDetachedFoldersUseCase");
                    c20358OooO00o.OooO0o0("No detached folders found", new Object[0]);
                    return new Integer(0);
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("RecoverDetachedFoldersUseCase");
                List list3 = list2;
                c20358OooO00o2.OooO0o0(OooO.OooO00o(list2.size(), "Found ", " detached folders to recover: ", OooOo.o000oOoO(list3, null, null, null, new C27778OooO0Oo(), 31)), new Object[0]);
                it = list3.iterator();
                list = list2;
                while (it.hasNext()) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("RecoverDetachedFoldersUseCase");
                c20358OooO00o3.OooO0o0(o0Oo0oo.OooO0O0(list.size(), "Successfully recovered ", " detached folders"), new Object[0]);
                return new Integer(list.size());
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f98133OooOoO0;
            C27782OooO0oo c27782OooO0oo2 = this.f98130OooOo;
            list = this.f98131OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c27782OooO0oo = c27782OooO0oo2;
            while (it.hasNext()) {
                Folder folder = (Folder) it.next();
                this.f98131OooOo0o = list;
                this.f98130OooOo = c27782OooO0oo;
                this.f98133OooOoO0 = it;
                this.f98132OooOoO = 3;
                c27782OooO0oo.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27779OooO0o(folder, null, c27782OooO0oo), this);
                if (objOooO0o != EnumC32485OooO00o.f116726OooOo0o) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o32.OooOOO0("RecoverDetachedFoldersUseCase");
            c20358OooO00o32.OooO0o0(o0Oo0oo.OooO0O0(list.size(), "Successfully recovered ", " detached folders"), new Object[0]);
            return new Integer(list.size());
        }
        C32446OooOOOo.OooO0O0(obj);
        List list4 = (List) obj;
        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o4.OooOOO0("RecoverDetachedFoldersUseCase");
        c20358OooO00o4.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("foldersInTrashBin size: ", OooOo.o000oOoO(list4, null, null, null, new C27777OooO0OO(), 31)), new Object[0]);
        this.f98132OooOoO = 2;
        obj = C27782OooO0oo.OooO00o(c27782OooO0oo, list4, this);
    }
}
