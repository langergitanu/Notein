package o0OO0o0;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
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
import oOo000Oo.C34426OooOO0o;

/* JADX INFO: renamed from: o0OO0o0.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveDriveSyncBackend$collectAllFiles$2", m80623f = "OneDriveDriveSyncBackend.kt", m80624l = {482}, m80625m = "invokeSuspend")
public final class C26856OooooOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<C26804OooO0OO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public List f92972OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34426OooOO0o f92973OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f92974OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f92975OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ o00oO0O f92976OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26856OooooOo(String str, o00oO0O o00oo0o, Continuation<? super C26856OooooOo> continuation) {
        super(2, continuation);
        this.f92974OooOoO = str;
        this.f92976OooOoOO = o00oo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26856OooooOo(this.f92974OooOoO, this.f92976OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<C26804OooO0OO>> continuation) {
        return ((C26856OooooOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0058 -> B:14:0x005b). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List arrayList;
        C34426OooOO0o c34426OooOO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92975OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34426OooOO0o c34426OooOO0o2 = new C34426OooOO0o();
            arrayList = new ArrayList();
            c34426OooOO0o2.addLast(this.f92974OooOoO);
            c34426OooOO0o = c34426OooOO0o2;
            if (!c34426OooOO0o.isEmpty()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = this.f92972OooOo;
            c34426OooOO0o = this.f92973OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            for (C26804OooO0OO c26804OooO0OO : (List) obj) {
                String id = c26804OooO0OO.getId();
                if (id != null) {
                    if (c26804OooO0OO.getFolder() != null) {
                        c34426OooOO0o.addLast(id);
                    } else if (c26804OooO0OO.getFile() != null) {
                        arrayList.add(c26804OooO0OO);
                    }
                }
            }
            if (!c34426OooOO0o.isEmpty()) {
                String str = (String) c34426OooOO0o.removeFirst();
                C26800OooO c26800OooO = this.f92976OooOoOO.f93066OooO0OO;
                this.f92973OooOo0o = c34426OooOO0o;
                this.f92972OooOo = arrayList;
                this.f92975OooOoO0 = 1;
                c26800OooO.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26823OooOo0O(c26800OooO, str, null), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                while (r9.hasNext()) {
                }
                if (!c34426OooOO0o.isEmpty()) {
                    return arrayList;
                }
            }
        }
    }
}
