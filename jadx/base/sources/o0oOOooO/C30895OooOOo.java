package o0oOOooO;

import com.orion.notein.domain.models.sticker.Sticker;
import com.orion.notein.domain.models.sticker.StickerCollection;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOO0oo.C27072OooOO0O;
import o0OOo0Oo.InterfaceC27321Oooo0o;
import o0OOo0o.C27526o00o0O00;
import o0OOo0o.C27538o00o0o0O;
import o0oOoOo.C31079OoooOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0oOOooO.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.StickerViewModel$stickers$1", m80623f = "StickerViewModel.kt", m80624l = {141, 143}, m80625m = "invokeSuspend")
public final class C30895OooOOo extends AbstractC32476OooO implements oO0O000o.OooOo00<String, Boolean, Set<? extends String>, List<? extends StickerCollection>, Boolean, Continuation<? super List<? extends C31079OoooOoO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f110411OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110412OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Set f110413OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ boolean f110414OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C30898OooOo00 f110415OooOoOO;

    /* JADX INFO: renamed from: o0oOOooO.OooOOo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.StickerViewModel$stickers$1$getSortedStickers$1", m80623f = "StickerViewModel.kt", m80624l = {131, 132}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super List<? extends Sticker>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f110416OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f110417OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f110418OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C30898OooOo00 f110419OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C30898OooOo00 c30898OooOo00, String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f110419OooOoO0 = c30898OooOo00;
            this.f110418OooOoO = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f110419OooOoO0, this.f110418OooOoO, continuation);
            oooO00o.f110416OooOo = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(String str, Continuation<? super List<? extends Sticker>> continuation) {
            return ((OooO00o) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            StickerCollection stickerCollection;
            Object next;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f110417OooOo0o;
            C30898OooOo00 c30898OooOo00 = this.f110419OooOoO0;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                String str = (String) this.f110416OooOo;
                InterfaceC27321Oooo0o interfaceC27321Oooo0o = c30898OooOo00.f110433OooO0Oo;
                String strOooO0Oo = c30898OooOo00.f110435OooO0o0.OooO0Oo();
                this.f110417OooOo0o = 1;
                obj = interfaceC27321Oooo0o.OooO(str, strOooO0Oo, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                stickerCollection = (StickerCollection) this.f110416OooOo;
                C32446OooOOOo.OooO0O0(obj);
                List list = (List) obj;
                List<String> children = stickerCollection.getChildren();
                ArrayList arrayList = new ArrayList();
                for (String str2 : children) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((Sticker) next).getId(), str2)) {
                            break;
                        }
                    }
                    Sticker sticker = (Sticker) next;
                    if (sticker != null) {
                        arrayList.add(sticker);
                    }
                }
                return arrayList;
            }
            C32446OooOOOo.OooO0O0(obj);
            StickerCollection stickerCollection2 = (StickerCollection) obj;
            if (stickerCollection2 == null) {
                return C34434OooOoO.f123453OooOo0o;
            }
            C27072OooOO0O c27072OooOO0OOooO00o = c30898OooOo00.f110433OooO0Oo.OooO00o(this.f110418OooOoO);
            this.f110416OooOo = stickerCollection2;
            this.f110417OooOo0o = 2;
            Object objOooOOo = C25252OooO0Oo.OooOOo(c27072OooOO0OOooO00o, this);
            if (objOooOOo != enumC32485OooO00o) {
                stickerCollection = stickerCollection2;
                obj = objOooOOo;
                List list2 = (List) obj;
                List<String> children2 = stickerCollection.getChildren();
                ArrayList arrayList2 = new ArrayList();
                while (r0.hasNext()) {
                }
                return arrayList2;
            }
            return enumC32485OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30895OooOOo(Continuation continuation, C30898OooOo00 c30898OooOo00) {
        super(6, continuation);
        this.f110415OooOoOO = c30898OooOo00;
    }

    @Override // oO0O000o.OooOo00
    public final Object Oooo0OO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Serializable serializable) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((Boolean) obj5).getClass();
        C30895OooOOo c30895OooOOo = new C30895OooOOo((Continuation) serializable, this.f110415OooOoOO);
        c30895OooOOo.f110411OooOo = (String) obj;
        c30895OooOOo.f110414OooOoO0 = zBooleanValue;
        c30895OooOOo.f110413OooOoO = (Set) obj3;
        return c30895OooOOo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        Set set;
        List list;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110412OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String str = (String) this.f110411OooOo;
            boolean z2 = this.f110414OooOoO0;
            Set set2 = this.f110413OooOoO;
            C30898OooOo00 c30898OooOo00 = this.f110415OooOoOO;
            OooO00o oooO00o = new OooO00o(c30898OooOo00, str, null);
            if (str.length() == 0) {
                C27538o00o0o0O c27538o00o0o0O = c30898OooOo00.f110434OooO0o;
                this.f110411OooOo = set2;
                this.f110414OooOoO0 = z2;
                this.f110412OooOo0o = 1;
                c27538o00o0o0O.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27526o00o0O00(c27538o00o0o0O, null), this);
                if (obj != enumC32485OooO00o) {
                    z = z2;
                    set = set2;
                    list = (List) obj;
                }
            } else {
                this.f110411OooOo = set2;
                this.f110414OooOoO0 = z2;
                this.f110412OooOo0o = 2;
                obj = oooO00o.invoke(str, this);
                if (obj != enumC32485OooO00o) {
                    z = z2;
                    set = set2;
                    list = (List) obj;
                }
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            z = this.f110414OooOoO0;
            set = (Set) this.f110411OooOo;
            C32446OooOOOo.OooO0O0(obj);
            list = (List) obj;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.f110414OooOoO0;
            set = (Set) this.f110411OooOo;
            C32446OooOOOo.OooO0O0(obj);
            list = (List) obj;
        }
        boolean z3 = z;
        Set set3 = set;
        List<Sticker> list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        for (Sticker sticker : list2) {
            arrayList.add(new C31079OoooOoO(sticker.getId(), sticker.getParentId(), sticker.getPath(), sticker.getBuiltIn(), sticker.getLastUsedTime(), set3.contains(sticker.getId()), z3, sticker.getSvgAspectRatio()));
        }
        return arrayList;
    }
}
