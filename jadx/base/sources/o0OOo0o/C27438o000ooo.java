package o0OOo0o;

import com.aspose.words.TableStyleOptions;
import com.orion.notein.domain.models.page.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0O0oooO.C26264OooOOO0;
import o0OO00o0.C26588o00O00oO;
import o0OO00o0.C26596o00O0o0;
import o0OO00o0.C26641o00Ooo0;
import o0OO00o0.C26643o00Ooo0O;
import o0OO00o0.C26647o00OooOO;
import o0OO00o0.C26649o00OoooO;
import o0OO00o0.C26669o00o0OOO;
import o0OO00o0.C26670o00o0OOo;
import o0OO00o0.C26676o00o0o00;
import o0OO00o0.C26685o00oOoo;
import o0OOo0Oo.InterfaceC27301OooOOo;
import o0OOo0Oo.InterfaceC27323Oooo0oO;
import o0OOooo0.C27981OooO00o;
import o0OOooo0.C27994OooOOOO;
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

/* JADX INFO: renamed from: o0OOo0o.o000ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$clearPage$2", m80623f = "NoteUseCase.kt", m80624l = {654, 655, 656, 658, 659, 660, 666, 667, 668, 670, 671, TableStyleOptions.DEFAULT, 673, 675}, m80625m = "invokeSuspend")
public final class C27438o000ooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f95844OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public List f95845OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f95846OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f95847OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f95848OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ boolean f95849OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27438o000ooo(C27449o00O0OoO c27449o00O0OoO, String str, String str2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f95847OooOoO0 = c27449o00O0OoO;
        this.f95846OooOoO = str;
        this.f95848OooOoOO = str2;
        this.f95849OooOoo0 = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27438o000ooo(this.f95847OooOoO0, this.f95846OooOoO, this.f95848OooOoOO, this.f95849OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27438o000ooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0109, code lost:
    
        if (r10 != r0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e5, code lost:
    
        if (r10 == r0) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d A[LOOP:1: B:28:0x0097->B:30:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133 A[PHI: r1
      0x0133: PHI (r1v19 java.util.List) = (r1v18 java.util.List), (r1v24 java.util.List) binds: [B:59:0x012f, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014a A[LOOP:0: B:62:0x0144->B:64:0x014a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cb  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        C26596o00O0o0 c26596o00O0o0;
        ArrayList arrayList;
        Iterator it;
        InterfaceC27323Oooo0oO interfaceC27323Oooo0oO;
        Object objOooO0O0;
        EnumC32485OooO00o enumC32485OooO00o;
        Object objOooO00o;
        EnumC32485OooO00o enumC32485OooO00o2;
        List list2;
        C26596o00O0o0 c26596o00O0o02;
        C26596o00O0o0 c26596o00O0o03;
        ArrayList arrayList2;
        Iterator it2;
        InterfaceC27323Oooo0oO interfaceC27323Oooo0oO2;
        Object objOooO0O02;
        EnumC32485OooO00o enumC32485OooO00o3;
        Object objOooO00o2;
        EnumC32485OooO00o enumC32485OooO00o4;
        InterfaceC27301OooOOo interfaceC27301OooOOo;
        EnumC32485OooO00o enumC32485OooO00o5 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95844OooOo;
        String str = this.f95846OooOoO;
        String str2 = this.f95848OooOoOO;
        C27449o00O0OoO c27449o00O0OoO = this.f95847OooOoO0;
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                C26596o00O0o0 c26596o00O0o04 = c27449o00O0OoO.f96047OooOOO0;
                this.f95844OooOo = 7;
                obj = c26596o00O0o04.OooOOO0(str, str2, this);
                if (obj != enumC32485OooO00o5) {
                    list2 = (List) obj;
                    c26596o00O0o02 = c27449o00O0OoO.f96047OooOOO0;
                    this.f95845OooOo0o = list2;
                    this.f95844OooOo = 8;
                    if (c26596o00O0o02.OooO0o(str, str2, this) != enumC32485OooO00o5) {
                        c26596o00O0o03 = c27449o00O0OoO.f96047OooOOO0;
                        List list3 = list2;
                        arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
                        it2 = list3.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Image) it2.next()).getUri());
                        }
                        this.f95845OooOo0o = null;
                        this.f95844OooOo = 9;
                        if (c26596o00O0o03.OooO0o0(str2, arrayList2) != enumC32485OooO00o5) {
                            interfaceC27323Oooo0oO2 = c27449o00O0OoO.f96034OooO;
                            this.f95844OooOo = 10;
                            if (interfaceC27323Oooo0oO2.OooO0o0(str, str2, this) != enumC32485OooO00o5) {
                                C26264OooOOO0 c26264OooOOO0 = c27449o00O0OoO.f96046OooOOO;
                                this.f95844OooOo = 11;
                                C26676o00o0o00 c26676o00o0o00 = (C26676o00o0o00) c26264OooOOO0.f89720OooO00o;
                                c26676o00o0o00.getClass();
                                objOooO0O02 = c26676o00o0o00.OooO0O0(str2, new C26670o00o0OOo(str, null));
                                enumC32485OooO00o3 = EnumC32485OooO00o.f116726OooOo0o;
                                if (objOooO0O02 != enumC32485OooO00o3) {
                                    objOooO0O02 = C32460OooOooO.f116667OooO00o;
                                }
                                if (objOooO0O02 != enumC32485OooO00o3) {
                                    objOooO0O02 = C32460OooOooO.f116667OooO00o;
                                }
                                if (objOooO0O02 != enumC32485OooO00o5) {
                                    C26649o00OoooO c26649o00OoooO = c27449o00O0OoO.f96051OooOOo0;
                                    this.f95844OooOo = 12;
                                    C26647o00OooOO c26647o00OooOO = c26649o00OoooO.f91973OooO00o;
                                    c26647o00OooOO.getClass();
                                    objOooO00o2 = c26647o00OooOO.OooO00o(str2, new C26643o00Ooo0O(str, null));
                                    enumC32485OooO00o4 = EnumC32485OooO00o.f116726OooOo0o;
                                    if (objOooO00o2 != enumC32485OooO00o4) {
                                        objOooO00o2 = C32460OooOooO.f116667OooO00o;
                                    }
                                    if (objOooO00o2 != enumC32485OooO00o4) {
                                        objOooO00o2 = C32460OooOooO.f116667OooO00o;
                                    }
                                    if (objOooO00o2 != enumC32485OooO00o5) {
                                        interfaceC27301OooOOo = c27449o00O0OoO.f96054OooOo0;
                                        this.f95844OooOo = 13;
                                        if (interfaceC27301OooOOo.OooO00o(str, str2, this) != enumC32485OooO00o5) {
                                            if (this.f95849OooOoo0) {
                                                C27994OooOOOO c27994OooOOOO = c27449o00O0OoO.f96058OooOoO;
                                                this.f95844OooOo = 14;
                                                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                                                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27981OooO00o(c27994OooOOOO, str, str2, null), this);
                                                if (objOooO0o != EnumC32485OooO00o.f116726OooOo0o) {
                                                    objOooO0o = C32460OooOooO.f116667OooO00o;
                                                }
                                                break;
                                            }
                                            return C32460OooOooO.f116667OooO00o;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return enumC32485OooO00o5;
            case 1:
                C32446OooOOOo.OooO0O0(obj);
                list = (List) obj;
                C26596o00O0o0 c26596o00O0o05 = c27449o00O0OoO.f96047OooOOO0;
                this.f95845OooOo0o = list;
                this.f95844OooOo = 2;
                C26588o00O00oO c26588o00O00oO = c26596o00O0o05.f91720OooO00o;
                c26588o00O00oO.getClass();
                Object objOooO00o3 = c26588o00O00oO.OooO00o(str2, new C26685o00oOoo(str, null));
                if (objOooO00o3 != enumC32485OooO00o5) {
                    objOooO00o3 = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO00o3 != enumC32485OooO00o5) {
                    objOooO00o3 = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO00o3 != enumC32485OooO00o5) {
                    c26596o00O0o0 = c27449o00O0OoO.f96047OooOOO0;
                    List list4 = list;
                    arrayList = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
                    it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Image) it.next()).getUri());
                    }
                    this.f95845OooOo0o = null;
                    this.f95844OooOo = 3;
                    if (c26596o00O0o0.OooO0o0(str2, arrayList) != enumC32485OooO00o5) {
                        interfaceC27323Oooo0oO = c27449o00O0OoO.f96034OooO;
                        this.f95844OooOo = 4;
                        if (interfaceC27323Oooo0oO.OooO00o(str, str2, this) != enumC32485OooO00o5) {
                            C26264OooOOO0 c26264OooOOO02 = c27449o00O0OoO.f96046OooOOO;
                            this.f95844OooOo = 5;
                            C26676o00o0o00 c26676o00o0o002 = (C26676o00o0o00) c26264OooOOO02.f89720OooO00o;
                            c26676o00o0o002.getClass();
                            objOooO0O0 = c26676o00o0o002.OooO0O0(str2, new C26669o00o0OOO(str, null));
                            enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                            if (objOooO0O0 != enumC32485OooO00o) {
                                objOooO0O0 = C32460OooOooO.f116667OooO00o;
                            }
                            if (objOooO0O0 != enumC32485OooO00o) {
                                objOooO0O0 = C32460OooOooO.f116667OooO00o;
                            }
                            if (objOooO0O0 != enumC32485OooO00o5) {
                                C26649o00OoooO c26649o00OoooO2 = c27449o00O0OoO.f96051OooOOo0;
                                this.f95844OooOo = 6;
                                C26647o00OooOO c26647o00OooOO2 = c26649o00OoooO2.f91973OooO00o;
                                c26647o00OooOO2.getClass();
                                objOooO00o = c26647o00OooOO2.OooO00o(str2, new C26641o00Ooo0(str, null));
                                enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
                                if (objOooO00o != enumC32485OooO00o2) {
                                    objOooO00o = C32460OooOooO.f116667OooO00o;
                                }
                                if (objOooO00o != enumC32485OooO00o2) {
                                    objOooO00o = C32460OooOooO.f116667OooO00o;
                                }
                            }
                        }
                    }
                    break;
                }
                return enumC32485OooO00o5;
            case 2:
                list = this.f95845OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c26596o00O0o0 = c27449o00O0OoO.f96047OooOOO0;
                List list42 = list;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list42, 10));
                it = list42.iterator();
                while (it.hasNext()) {
                }
                this.f95845OooOo0o = null;
                this.f95844OooOo = 3;
                if (c26596o00O0o0.OooO0o0(str2, arrayList) != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 3:
                C32446OooOOOo.OooO0O0(obj);
                interfaceC27323Oooo0oO = c27449o00O0OoO.f96034OooO;
                this.f95844OooOo = 4;
                if (interfaceC27323Oooo0oO.OooO00o(str, str2, this) != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 4:
                C32446OooOOOo.OooO0O0(obj);
                C26264OooOOO0 c26264OooOOO022 = c27449o00O0OoO.f96046OooOOO;
                this.f95844OooOo = 5;
                C26676o00o0o00 c26676o00o0o0022 = (C26676o00o0o00) c26264OooOOO022.f89720OooO00o;
                c26676o00o0o0022.getClass();
                objOooO0O0 = c26676o00o0o0022.OooO0O0(str2, new C26669o00o0OOO(str, null));
                enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                if (objOooO0O0 != enumC32485OooO00o) {
                }
                if (objOooO0O0 != enumC32485OooO00o) {
                }
                if (objOooO0O0 != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 5:
                C32446OooOOOo.OooO0O0(obj);
                C26649o00OoooO c26649o00OoooO22 = c27449o00O0OoO.f96051OooOOo0;
                this.f95844OooOo = 6;
                C26647o00OooOO c26647o00OooOO22 = c26649o00OoooO22.f91973OooO00o;
                c26647o00OooOO22.getClass();
                objOooO00o = c26647o00OooOO22.OooO00o(str2, new C26641o00Ooo0(str, null));
                enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
                if (objOooO00o != enumC32485OooO00o2) {
                }
                if (objOooO00o != enumC32485OooO00o2) {
                }
                break;
            case 6:
            case 14:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 7:
                C32446OooOOOo.OooO0O0(obj);
                list2 = (List) obj;
                c26596o00O0o02 = c27449o00O0OoO.f96047OooOOO0;
                this.f95845OooOo0o = list2;
                this.f95844OooOo = 8;
                if (c26596o00O0o02.OooO0o(str, str2, this) != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 8:
                list2 = this.f95845OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c26596o00O0o03 = c27449o00O0OoO.f96047OooOOO0;
                List list32 = list2;
                arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list32, 10));
                it2 = list32.iterator();
                while (it2.hasNext()) {
                }
                this.f95845OooOo0o = null;
                this.f95844OooOo = 9;
                if (c26596o00O0o03.OooO0o0(str2, arrayList2) != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 9:
                C32446OooOOOo.OooO0O0(obj);
                interfaceC27323Oooo0oO2 = c27449o00O0OoO.f96034OooO;
                this.f95844OooOo = 10;
                if (interfaceC27323Oooo0oO2.OooO0o0(str, str2, this) != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 10:
                C32446OooOOOo.OooO0O0(obj);
                C26264OooOOO0 c26264OooOOO03 = c27449o00O0OoO.f96046OooOOO;
                this.f95844OooOo = 11;
                C26676o00o0o00 c26676o00o0o003 = (C26676o00o0o00) c26264OooOOO03.f89720OooO00o;
                c26676o00o0o003.getClass();
                objOooO0O02 = c26676o00o0o003.OooO0O0(str2, new C26670o00o0OOo(str, null));
                enumC32485OooO00o3 = EnumC32485OooO00o.f116726OooOo0o;
                if (objOooO0O02 != enumC32485OooO00o3) {
                }
                if (objOooO0O02 != enumC32485OooO00o3) {
                }
                if (objOooO0O02 != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 11:
                C32446OooOOOo.OooO0O0(obj);
                C26649o00OoooO c26649o00OoooO3 = c27449o00O0OoO.f96051OooOOo0;
                this.f95844OooOo = 12;
                C26647o00OooOO c26647o00OooOO3 = c26649o00OoooO3.f91973OooO00o;
                c26647o00OooOO3.getClass();
                objOooO00o2 = c26647o00OooOO3.OooO00o(str2, new C26643o00Ooo0O(str, null));
                enumC32485OooO00o4 = EnumC32485OooO00o.f116726OooOo0o;
                if (objOooO00o2 != enumC32485OooO00o4) {
                }
                if (objOooO00o2 != enumC32485OooO00o4) {
                }
                if (objOooO00o2 != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 12:
                C32446OooOOOo.OooO0O0(obj);
                interfaceC27301OooOOo = c27449o00O0OoO.f96054OooOo0;
                this.f95844OooOo = 13;
                if (interfaceC27301OooOOo.OooO00o(str, str2, this) != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 13:
                C32446OooOOOo.OooO0O0(obj);
                if (this.f95849OooOoo0) {
                }
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
