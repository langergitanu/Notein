package o0OOo0o;

import com.orion.notein.domain.models.sticker.StickerCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOo0o.o00o0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27525o00o0O0<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f96485OooOo0o;

    /* JADX INFO: renamed from: o0OOo0o.o00o0O0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.StickerUseCase$getSortedStickerCollections$$inlined$map$1$2", m80623f = "StickerUseCase.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f96486OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f96487OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f96487OooOo0o = obj;
            this.f96486OooOo |= Integer.MIN_VALUE;
            return C27525o00o0O0.this.emit(null, this);
        }
    }

    public C27525o00o0O0(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
        this.f96485OooOo0o = interfaceC33723OooO0oO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f96486OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f96486OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f96487OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f96486OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            List list = (List) obj;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (!((StickerCollection) t).getBuiltIn()) {
                    arrayList.add(t);
                }
            }
            List listO00O0O = oOo000Oo.OooOo.o00O0O(arrayList, new C27527o00o0O0O());
            ArrayList arrayList2 = new ArrayList();
            for (T t2 : list) {
                if (((StickerCollection) t2).getBuiltIn()) {
                    arrayList2.add(t2);
                }
            }
            int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList2, 10));
            if (iOooO0Oo < 16) {
                iOooO0Oo = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
            for (Object obj3 : arrayList2) {
                linkedHashMap.put(((StickerCollection) obj3).getId(), obj3);
            }
            List<String> list2 = C27538o00o0o0O.f96549OooO0oO;
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                StickerCollection stickerCollection = (StickerCollection) linkedHashMap.get("notein_built_in_sticker_set_" + ((String) it.next()));
                if (stickerCollection != null) {
                    arrayList3.add(stickerCollection);
                }
            }
            ArrayList arrayListOooooOO = oOo000Oo.OooOo.OooooOO(listO00O0O, arrayList3);
            oooO00o.f96486OooOo = 1;
            if (this.f96485OooOo0o.emit(arrayListOooooOO, oooO00o) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
