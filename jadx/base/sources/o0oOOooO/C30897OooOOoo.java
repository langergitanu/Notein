package o0oOOooO;

import com.aspose.words.StyleIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27537o00o0o00;
import o0OOo0o.C27538o00o0o0O;
import o0oOoOo.C31079OoooOoO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0oOOooO.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.StickerViewModel$updateStickersLastUsedTime$1", m80623f = "StickerViewModel.kt", m80624l = {StyleIdentifier.LIGHT_GRID_ACCENT_6}, m80625m = "invokeSuspend")
public final class C30897OooOOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30898OooOo00 f110429OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110430OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<C31079OoooOoO> f110431OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30897OooOOoo(C30898OooOo00 c30898OooOo00, List<C31079OoooOoO> list, Continuation<? super C30897OooOOoo> continuation) {
        super(2, continuation);
        this.f110429OooOo = c30898OooOo00;
        this.f110431OooOoO0 = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30897OooOOoo(this.f110429OooOo, this.f110431OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30897OooOOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110430OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30898OooOo00 c30898OooOo00 = this.f110429OooOo;
            C33781o00o0O c33781o00o0O = c30898OooOo00.f110446OooOOo0;
            Boolean boolValueOf = Boolean.valueOf(!((Boolean) c33781o00o0O.getValue()).booleanValue());
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, boolValueOf);
            List<C31079OoooOoO> list = this.f110431OooOoO0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj3 : list) {
                String str = ((C31079OoooOoO) obj3).f110918OooO0O0;
                Object arrayList = linkedHashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(str, arrayList);
                }
                ((List) arrayList).add(obj3);
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                List list2 = (List) entry.getValue();
                ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((C31079OoooOoO) it.next()).f110917OooO00o);
                }
                arrayList2.add(new C32443OooOOO(str2, arrayList3));
            }
            Map mapOooOO0o = C34444Oooo0O0.OooOO0o(arrayList2);
            this.f110430OooOo0o = 1;
            C27538o00o0o0O c27538o00o0o0O = c30898OooOo00.f110434OooO0o;
            c27538o00o0o0O.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27537o00o0o00(mapOooOO0o, c27538o00o0o0O, null), this);
            if (objOooO0o != EnumC32485OooO00o.f116726OooOo0o) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
