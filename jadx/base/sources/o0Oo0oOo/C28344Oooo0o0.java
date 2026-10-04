package o0Oo0oOo;

import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO0ooO.C26963OooOO0o;
import o0OO0ooO.C26965OooOOO0;
import o0OOo0Oo.InterfaceC27310OooOoO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33642Oooo0oo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0Oo0oOo.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryListViewModel$loadMaterialsFromRepo$allItems$1", m80623f = "CreativeLibraryListViewModel.kt", m80624l = {246}, m80625m = "invokeSuspend")
public final class C28344Oooo0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends C26963OooOO0o>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f100491OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Iterator f100492OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ List<String> f100493OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f100494OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C23033OooOO0o f100495OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ int f100496OooOoo0;

    /* JADX INFO: renamed from: o0Oo0oOo.Oooo0o0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryListViewModel$loadMaterialsFromRepo$allItems$1$1$1", m80623f = "CreativeLibraryListViewModel.kt", m80624l = {238}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends C26963OooOO0o>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C23033OooOO0o f100497OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f100498OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ int f100499OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f100500OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C23033OooOO0o c23033OooOO0o, String str, int i, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f100497OooOo = c23033OooOO0o;
            this.f100500OooOoO0 = str;
            this.f100499OooOoO = i;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f100497OooOo, this.f100500OooOoO0, this.f100499OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends C26963OooOO0o>> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f100498OooOo0o;
            String str = this.f100500OooOoO0;
            try {
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    InterfaceC27310OooOoO0 interfaceC27310OooOoO0 = this.f100497OooOo.f71077OooO0Oo;
                    int i2 = this.f100499OooOoO;
                    this.f100498OooOo0o = 1;
                    obj = interfaceC27310OooOoO0.OooO0OO(str, i2, this);
                    if (obj == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                C26965OooOOO0 c26965OooOOO0 = (C26965OooOOO0) obj;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("CreativeLibraryListVM");
                c20358OooO00o.OooO00o("loadMaterialsFromRepo: type=" + str + " got " + c26965OooOOO0.f93670OooO00o.size() + " items", new Object[0]);
                return c26965OooOOO0.f93670OooO00o;
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooO0Oo(e, androidx.core.app.OooO.OooO0O0(c20358OooO00o2, "CreativeLibraryListVM", "Failed to load materials for type: ", str), new Object[0]);
                return C34434OooOoO.f123453OooOo0o;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28344Oooo0o0(List<String> list, C23033OooOO0o c23033OooOO0o, int i, Continuation<? super C28344Oooo0o0> continuation) {
        super(2, continuation);
        this.f100493OooOoO = list;
        this.f100495OooOoOO = c23033OooOO0o;
        this.f100496OooOoo0 = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28344Oooo0o0 c28344Oooo0o0 = new C28344Oooo0o0(this.f100493OooOoO, this.f100495OooOoOO, this.f100496OooOoo0, continuation);
        c28344Oooo0o0.f100494OooOoO0 = obj;
        return c28344Oooo0o0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends C26963OooOO0o>> continuation) {
        return ((C28344Oooo0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0074 -> B:18:0x0077). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Collection collection;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100491OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f100494OooOoO0;
            List<String> list = this.f100493OooOoO;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C33609OooO0oo.OooO00o(interfaceC33636Oooo00o, null, new OooO00o(this.f100495OooOoOO, (String) it2.next(), this.f100496OooOoo0, null), 3));
            }
            ArrayList arrayList2 = new ArrayList();
            it = arrayList.iterator();
            collection = arrayList2;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f100492OooOo0o;
            collection = (Collection) this.f100494OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
            C34431OooOo0.OooOo0o(collection, (Iterable) obj);
            if (it.hasNext()) {
                InterfaceC33642Oooo0oo interfaceC33642Oooo0oo = (InterfaceC33642Oooo0oo) it.next();
                this.f100494OooOoO0 = collection;
                this.f100492OooOo0o = it;
                this.f100491OooOo = 1;
                obj = interfaceC33642Oooo0oo.await(this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                C34431OooOo0.OooOo0o(collection, (Iterable) obj);
                if (it.hasNext()) {
                    return (List) collection;
                }
            }
        }
    }
}
