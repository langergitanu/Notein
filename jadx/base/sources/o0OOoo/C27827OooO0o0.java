package o0OOoo;

import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0OOoo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.page.RecoverPageUseCase$recoverAllPages$2", m80623f = "RecoverPageUseCase.kt", m80624l = {56, 59, 67}, m80625m = "invokeSuspend")
public final class C27827OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends C32460OooOooO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Collection f98301OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f98302OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Page f98303OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f98304OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f98305OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C27821OooO f98306OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f98307OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f98308OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27827OooO0o0(C27821OooO c27821OooO, String str, Continuation<? super C27827OooO0o0> continuation) {
        super(2, continuation);
        this.f98306OooOoo = c27821OooO;
        this.f98308OooOooO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27827OooO0o0 c27827OooO0o0 = new C27827OooO0o0(this.f98306OooOoo, this.f98308OooOooO, continuation);
        c27827OooO0o0.f98307OooOoo0 = obj;
        return c27827OooO0o0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends C32460OooOooO>> continuation) {
        return ((C27827OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0078 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:8:0x001a, B:45:0x00d7, B:46:0x00e8, B:48:0x00ee, B:49:0x00fc, B:15:0x0038, B:32:0x00a1, B:37:0x00ad, B:26:0x0072, B:28:0x0078, B:39:0x00b4, B:41:0x00bd, B:50:0x0116, B:51:0x0130, B:35:0x00a7, B:18:0x0043, B:25:0x0065, B:21:0x0052), top: B:55:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:8:0x001a, B:45:0x00d7, B:46:0x00e8, B:48:0x00ee, B:49:0x00fc, B:15:0x0038, B:32:0x00a1, B:37:0x00ad, B:26:0x0072, B:28:0x0078, B:39:0x00b4, B:41:0x00bd, B:50:0x0116, B:51:0x0130, B:35:0x00a7, B:18:0x0043, B:25:0x0065, B:21:0x0052), top: B:55:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:8:0x001a, B:45:0x00d7, B:46:0x00e8, B:48:0x00ee, B:49:0x00fc, B:15:0x0038, B:32:0x00a1, B:37:0x00ad, B:26:0x0072, B:28:0x0078, B:39:0x00b4, B:41:0x00bd, B:50:0x0116, B:51:0x0130, B:35:0x00a7, B:18:0x0043, B:25:0x0065, B:21:0x0052), top: B:55:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:8:0x001a, B:45:0x00d7, B:46:0x00e8, B:48:0x00ee, B:49:0x00fc, B:15:0x0038, B:32:0x00a1, B:37:0x00ad, B:26:0x0072, B:28:0x0078, B:39:0x00b4, B:41:0x00bd, B:50:0x0116, B:51:0x0130, B:35:0x00a7, B:18:0x0043, B:25:0x0065, B:21:0x0052), top: B:55:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee A[Catch: all -> 0x001f, LOOP:0: B:46:0x00e8->B:48:0x00ee, LOOP_END, TryCatch #0 {all -> 0x001f, blocks: (B:8:0x001a, B:45:0x00d7, B:46:0x00e8, B:48:0x00ee, B:49:0x00fc, B:15:0x0038, B:32:0x00a1, B:37:0x00ad, B:26:0x0072, B:28:0x0078, B:39:0x00b4, B:41:0x00bd, B:50:0x0116, B:51:0x0130, B:35:0x00a7, B:18:0x0043, B:25:0x0065, B:21:0x0052), top: B:55:0x0008 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009a -> B:32:0x00a1). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO00o;
        String str;
        C27821OooO c27821OooO;
        Collection arrayList;
        Iterator it;
        List list;
        C27821OooO c27821OooO2;
        Iterator it2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98305OooOoOO;
        try {
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27821OooO c27821OooO3 = this.f98306OooOoo;
            str = this.f98308OooOooO;
            C27449o00O0OoO c27449o00O0OoO = c27821OooO3.f98278OooO00o;
            this.f98307OooOoo0 = c27821OooO3;
            this.f98302OooOo0o = str;
            this.f98305OooOoOO = 1;
            Object objOooOooO = c27449o00O0OoO.OooOooO(str, this);
            if (objOooOooO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27821OooO = c27821OooO3;
            obj = objOooOooO;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.f98301OooOo;
                    str = this.f98302OooOo0o;
                    c27821OooO2 = (C27821OooO) this.f98307OooOoo0;
                    C32446OooOOOo.OooO0O0(obj);
                    List list2 = list;
                    ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                    it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Page) it2.next()).getId());
                    }
                    Set setO0OO00O = OooOo.o0OO00O(arrayList2);
                    c27821OooO2.getClass();
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C27829OooO0oo(c27821OooO2, setO0OO00O, str, null), 3);
                    objOooO00o = C32460OooOooO.f116667OooO00o;
                    return new C32445OooOOOO(objOooO00o);
                }
                Page page = this.f98303OooOoO;
                Iterator it3 = this.f98304OooOoO0;
                arrayList = this.f98301OooOo;
                String str2 = this.f98302OooOo0o;
                C27821OooO c27821OooO4 = (C27821OooO) this.f98307OooOoo0;
                C32446OooOOOo.OooO0O0(obj);
                Page page2 = (Page) obj;
                Page pageOooO00o = page2 != null ? null : C27821OooO.OooO00o(c27821OooO4, page, page2);
                if (pageOooO00o != null) {
                    arrayList.add(pageOooO00o);
                }
                it = it3;
                str = str2;
                c27821OooO = c27821OooO4;
                if (it.hasNext()) {
                    Page page3 = (Page) it.next();
                    Ooooo00.OooO oooO = c27821OooO.f98280OooO0OO;
                    String id = page3.getId();
                    this.f98307OooOoo0 = c27821OooO;
                    this.f98302OooOo0o = str;
                    this.f98301OooOo = arrayList;
                    this.f98304OooOoO0 = it;
                    this.f98303OooOoO = page3;
                    this.f98305OooOoOO = 2;
                    Object objOooO00o2 = oooO.OooO00o(str, id, this);
                    if (objOooO00o2 != enumC32485OooO00o) {
                        C27821OooO c27821OooO5 = c27821OooO;
                        it3 = it;
                        obj = objOooO00o2;
                        c27821OooO4 = c27821OooO5;
                        str2 = str;
                        page = page3;
                        Page page22 = (Page) obj;
                        if (page22 != null) {
                        }
                        if (pageOooO00o != null) {
                        }
                        it = it3;
                        str = str2;
                        c27821OooO = c27821OooO4;
                        if (it.hasNext()) {
                            List list3 = (List) arrayList;
                            if (list3.isEmpty()) {
                                throw new IllegalStateException(("No pages to recover in note: " + str).toString());
                            }
                            C27449o00O0OoO c27449o00O0OoO2 = c27821OooO.f98278OooO00o;
                            this.f98307OooOoo0 = c27821OooO;
                            this.f98302OooOo0o = str;
                            this.f98301OooOo = list3;
                            this.f98304OooOoO0 = null;
                            this.f98303OooOoO = null;
                            this.f98305OooOoOO = 3;
                            if (c27449o00O0OoO2.OoooO0O(str, list3, this) != enumC32485OooO00o) {
                                list = list3;
                                c27821OooO2 = c27821OooO;
                                List list22 = list;
                                ArrayList arrayList22 = new ArrayList(C34428OooOOo.OooOOoo(list22, 10));
                                it2 = list22.iterator();
                                while (it2.hasNext()) {
                                }
                                Set setO0OO00O2 = OooOo.o0OO00O(arrayList22);
                                c27821OooO2.getClass();
                                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C27829OooO0oo(c27821OooO2, setO0OO00O2, str, null), 3);
                                objOooO00o = C32460OooOooO.f116667OooO00o;
                                return new C32445OooOOOO(objOooO00o);
                            }
                        }
                    }
                }
                return enumC32485OooO00o;
            }
            str = this.f98302OooOo0o;
            c27821OooO = (C27821OooO) this.f98307OooOoo0;
            C32446OooOOOo.OooO0O0(obj);
        }
        arrayList = new ArrayList();
        it = ((List) obj).iterator();
        if (it.hasNext()) {
        }
        return enumC32485OooO00o;
    }
}
