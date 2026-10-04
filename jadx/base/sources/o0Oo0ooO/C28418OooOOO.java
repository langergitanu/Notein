package o0Oo0ooO;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.LabelRef;
import com.orion.notein.domain.models.LabelType;
import com.orion.notein.p607ui.label.C23135OooO0o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27600o0ooOO0;
import o0OOo0o.o00000O0;
import oO00ooO.C32442OooOO0o;
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
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0Oo0ooO.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.label.ItemLabelViewModel$pushToCloudAfterLabelChanged$1", m80623f = "ItemLabelViewModel.kt", m80624l = {240, StyleIdentifier.LIGHT_GRID_ACCENT_6, StyleIdentifier.COLORFUL_LIST_ACCENT_6}, m80625m = "invokeSuspend")
public final class C28418OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Iterator f100735OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C23135OooO0o0 f100736OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public List f100737OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f100738OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f100739OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C23135OooO0o0 f100740OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ List<LabelRef> f100741OooOoo0;

    /* JADX INFO: renamed from: o0Oo0ooO.OooOOO$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f100742OooO00o;

        static {
            int[] iArr = new int[LabelType.values().length];
            try {
                iArr[LabelType.NOTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LabelType.FOLDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LabelType.PAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f100742OooO00o = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28418OooOOO(List<LabelRef> list, C23135OooO0o0 c23135OooO0o0, Continuation<? super C28418OooOOO> continuation) {
        super(2, continuation);
        this.f100741OooOoo0 = list;
        this.f100740OooOoo = c23135OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28418OooOOO(this.f100741OooOoo0, this.f100740OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28418OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d5, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01dc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e9 -> B:37:0x00f0). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterator it;
        C23135OooO0o0 c23135OooO0o0;
        C23135OooO0o0 c23135OooO0o02;
        Iterator it2;
        Iterator it3;
        List list;
        C23135OooO0o0 c23135OooO0o03;
        Iterator it4;
        Iterator it5;
        List list2;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100739OooOoOO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List<LabelRef> list3 = this.f100741OooOoo0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj3 : list3) {
                LabelType itemType = ((LabelRef) obj3).getItemType();
                Object arrayList = linkedHashMap.get(itemType);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(itemType, arrayList);
                }
                ((List) arrayList).add(obj3);
            }
            it = linkedHashMap.entrySet().iterator();
            c23135OooO0o0 = this.f100740OooOoo;
            if (it.hasNext()) {
            }
        } else if (i == 1) {
            list = this.f100737OooOoO;
            it3 = this.f100738OooOoO0;
            it2 = this.f100735OooOo;
            c23135OooO0o02 = this.f100736OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            while (it3.hasNext()) {
            }
            c23135OooO0o02.f72016OooOO0.OooO0o0(list);
            it = it2;
            c23135OooO0o0 = c23135OooO0o02;
            if (it.hasNext()) {
            }
        } else if (i == 2) {
            list2 = this.f100737OooOoO;
            it5 = this.f100738OooOoO0;
            it4 = this.f100735OooOo;
            c23135OooO0o03 = this.f100736OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            while (it5.hasNext()) {
            }
            c23135OooO0o03.f72016OooOO0.OooO0OO(list2);
            it = it4;
            c23135OooO0o0 = c23135OooO0o03;
            if (it.hasNext()) {
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Iterator it6 = this.f100738OooOoO0;
            Iterator it7 = this.f100735OooOo;
            C23135OooO0o0 c23135OooO0o04 = this.f100736OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            while (it6.hasNext()) {
                String str = (String) it6.next();
                C27449o00O0OoO c27449o00O0OoO = c23135OooO0o04.f72015OooO0oo;
                this.f100736OooOo0o = c23135OooO0o04;
                this.f100735OooOo = it7;
                this.f100738OooOoO0 = it6;
                this.f100737OooOoO = null;
                this.f100739OooOoOO = 3;
                if (c27449o00O0OoO.OoooOo0(str, this) == obj2) {
                    break;
                }
            }
            it = it7;
            c23135OooO0o0 = c23135OooO0o04;
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int i2 = OooO00o.f100742OooO00o[((LabelType) entry.getKey()).ordinal()];
                if (i2 == 1) {
                    Iterable iterable = (Iterable) entry.getValue();
                    ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
                    Iterator it8 = iterable.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(((LabelRef) it8.next()).getItemId());
                    }
                    it3 = arrayList2.iterator();
                    c23135OooO0o02 = c23135OooO0o0;
                    list = arrayList2;
                    it2 = it;
                    while (it3.hasNext()) {
                        String str2 = (String) it3.next();
                        C27449o00O0OoO c27449o00O0OoO2 = c23135OooO0o02.f72015OooO0oo;
                        this.f100736OooOo0o = c23135OooO0o02;
                        this.f100735OooOo = it2;
                        this.f100738OooOoO0 = it3;
                        this.f100737OooOoO = list;
                        this.f100739OooOoOO = 1;
                        if (c27449o00O0OoO2.OoooOo0(str2, this) == obj2) {
                            break;
                        }
                    }
                    c23135OooO0o02.f72016OooOO0.OooO0o0(list);
                    it = it2;
                    c23135OooO0o0 = c23135OooO0o02;
                    if (it.hasNext()) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                } else if (i2 == 2) {
                    Iterable iterable2 = (Iterable) entry.getValue();
                    ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
                    Iterator it9 = iterable2.iterator();
                    while (it9.hasNext()) {
                        arrayList3.add(((LabelRef) it9.next()).getItemId());
                    }
                    it5 = arrayList3.iterator();
                    c23135OooO0o03 = c23135OooO0o0;
                    list2 = arrayList3;
                    it4 = it;
                    while (it5.hasNext()) {
                        String str3 = (String) it5.next();
                        C27600o0ooOO0 c27600o0ooOO0 = c23135OooO0o03.f72010OooO;
                        this.f100736OooOo0o = c23135OooO0o03;
                        this.f100735OooOo = it4;
                        this.f100738OooOoO0 = it5;
                        this.f100737OooOoO = list2;
                        this.f100739OooOoOO = 2;
                        c27600o0ooOO0.getClass();
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00000O0(c27600o0ooOO0, str3, null), this);
                        if (objOooO0o != EnumC32485OooO00o.f116726OooOo0o) {
                            objOooO0o = C32460OooOooO.f116667OooO00o;
                        }
                        if (objOooO0o == obj2) {
                            break;
                        }
                    }
                    c23135OooO0o03.f72016OooOO0.OooO0OO(list2);
                    it = it4;
                    c23135OooO0o0 = c23135OooO0o03;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i2 != 3) {
                        throw new C32442OooOO0o();
                    }
                    Iterable iterable3 = (Iterable) entry.getValue();
                    ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(iterable3, 10));
                    Iterator it10 = iterable3.iterator();
                    while (it10.hasNext()) {
                        arrayList4.add(((LabelRef) it10.next()).getExtraInfo());
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : arrayList4) {
                        if (((String) obj4).length() > 0) {
                            arrayList5.add(obj4);
                        }
                    }
                    c23135OooO0o04 = c23135OooO0o0;
                    it6 = arrayList5.iterator();
                    it7 = it;
                    while (it6.hasNext()) {
                    }
                    it = it7;
                    c23135OooO0o0 = c23135OooO0o04;
                    if (it.hasNext()) {
                    }
                }
            }
        }
    }
}
