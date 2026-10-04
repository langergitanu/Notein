package o0OOo0o;

import com.aspose.slides.C22227OoooO;
import com.orion.notein.domain.models.NoteinFirebaseUser;
import com.orion.notein.domain.models.p605ai.AiFeatureConfig;
import com.orion.notein.domain.models.transactions.google.FirebaseUserMembership;
import java.util.List;
import java.util.Map;
import o00o00O0.C25252OooO0Oo;
import o0O.OooO00o;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0Oo.InterfaceC27300OooOOOo;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0Oo.InterfaceC27315OooOooo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OOo0o.o00ooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27597o00ooo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f96917OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC27315OooOooo f96918OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC27300OooOOOo f96919OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00000O f96920OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Map<Integer, Long> f96916OooO0o0 = oOo000Oo.Oooo0.OooO0o0(new C32443OooOOO(12, 1685548799000L));

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final List<Integer> f96915OooO0o = C34429OooOOo0.OooOO0o(0, 1, 2, 3, 16, 4, 5, 7, 6, 8, 9, 10, 11, 12);

    public C27597o00ooo00(C27129OoooOOO c27129OoooOOO, InterfaceC27313OooOoo0 noteMetaRepo, InterfaceC27315OooOooo firebaseUserRepo, InterfaceC27300OooOOOo googleBillingRepo, o00000O getRemoteConfigUseCase) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteMetaRepo, "noteMetaRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(firebaseUserRepo, "firebaseUserRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(googleBillingRepo, "googleBillingRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(getRemoteConfigUseCase, "getRemoteConfigUseCase");
        this.f96917OooO00o = noteMetaRepo;
        this.f96918OooO0O0 = firebaseUserRepo;
        this.f96919OooO0OO = googleBillingRepo;
        this.f96920OooO0Oo = getRemoteConfigUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C27597o00ooo00 c27597o00ooo00, int i, NoteinFirebaseUser noteinFirebaseUser, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27595o00ooOoo c27595o00ooOoo;
        FirebaseUserMembership firebaseUserMembership;
        boolean z;
        boolean z2;
        OooO00o.OooO0OO oooO0OO;
        c27597o00ooo00.getClass();
        if (abstractC32479OooO0OO instanceof C27595o00ooOoo) {
            c27595o00ooOoo = (C27595o00ooOoo) abstractC32479OooO0OO;
            int i2 = c27595o00ooOoo.f96910OooOoo0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27595o00ooOoo.f96910OooOoo0 = i2 - Integer.MIN_VALUE;
            } else {
                c27595o00ooOoo = new C27595o00ooOoo(c27597o00ooo00, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO0 = c27595o00ooOoo.f96907OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c27595o00ooOoo.f96910OooOoo0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOO0);
            if (noteinFirebaseUser == null) {
                firebaseUserMembership = null;
                int i4 = 0;
                if ((firebaseUserMembership == null ? firebaseUserMembership.getMembershipType() : null) == FirebaseUserMembership.MembershipType.LIFE_TIME) {
                    z = true;
                } else {
                    if ((firebaseUserMembership != null ? firebaseUserMembership.getMembershipType() : null) != FirebaseUserMembership.MembershipType.SUBSCRIPTION) {
                        z = false;
                    }
                }
                z2 = noteinFirebaseUser == null;
                o0O.OooO00o oooO00oOooO0OO = c27597o00ooo00.f96920OooO0Oo.f95374OooO00o.OooO0OO(true);
                oooO00oOooO0OO.getClass();
                if (i != 100) {
                    oooO0OO = oooO00oOooO0OO.f88096OoooO00;
                } else if (i != 101) {
                    switch (i) {
                        case 0:
                            oooO0OO = oooO00oOooO0OO.f88084Oooo0;
                            break;
                        case 1:
                            oooO0OO = oooO00oOooO0OO.f88067OooOOOo;
                            break;
                        case 2:
                            oooO0OO = oooO00oOooO0OO.f88075OooOo0o;
                            break;
                        case 3:
                            oooO0OO = oooO00oOooO0OO.f88070OooOOoo;
                            break;
                        case 4:
                            oooO0OO = oooO00oOooO0OO.f88068OooOOo;
                            break;
                        case 5:
                            oooO0OO = oooO00oOooO0OO.f88086Oooo00O;
                            break;
                        case 6:
                            oooO0OO = oooO00oOooO0OO.f88085Oooo000;
                            break;
                        default:
                            switch (i) {
                                case 8:
                                    oooO0OO = oooO00oOooO0OO.f88052OooO;
                                    break;
                                case 9:
                                    oooO0OO = oooO00oOooO0OO.f88060OooO0oo;
                                    break;
                                case 10:
                                    oooO0OO = oooO00oOooO0OO.f88077OooOoO0;
                                    break;
                                case 11:
                                    oooO0OO = oooO00oOooO0OO.f88074OooOo0O;
                                    break;
                                case 12:
                                    oooO0OO = oooO00oOooO0OO.f88054OooO0O0;
                                    break;
                                case 13:
                                    oooO0OO = oooO00oOooO0OO.f88072OooOo0;
                                    break;
                                default:
                                    switch (i) {
                                        case 15:
                                            oooO0OO = oooO00oOooO0OO.f88083Oooo;
                                            break;
                                        case 16:
                                            oooO0OO = oooO00oOooO0OO.f88073OooOo00;
                                            break;
                                        case 17:
                                            oooO0OO = oooO00oOooO0OO.f88056OooO0Oo;
                                            break;
                                        case 18:
                                            oooO0OO = oooO00oOooO0OO.f88062OooOO0O;
                                            break;
                                        case 19:
                                            oooO0OO = oooO00oOooO0OO.f88069OooOOo0;
                                            break;
                                        case 20:
                                            oooO0OO = oooO00oOooO0OO.f88071OooOo;
                                            break;
                                        case 21:
                                            oooO0OO = oooO00oOooO0OO.f88064OooOOO;
                                            break;
                                        case 22:
                                            oooO0OO = oooO00oOooO0OO.f88065OooOOO0;
                                            break;
                                        case 23:
                                            oooO0OO = oooO00oOooO0OO.f88066OooOOOO;
                                            break;
                                        case 24:
                                            oooO0OO = oooO00oOooO0OO.f88055OooO0OO;
                                            break;
                                        default:
                                            switch (i) {
                                                case 26:
                                                    oooO0OO = oooO00oOooO0OO.f88089Oooo0OO;
                                                    break;
                                                case 27:
                                                    oooO0OO = oooO00oOooO0OO.f88091Oooo0o0;
                                                    break;
                                                case 28:
                                                    oooO0OO = oooO00oOooO0OO.f88090Oooo0o;
                                                    break;
                                                case 29:
                                                    oooO0OO = oooO00oOooO0OO.f88092Oooo0oO;
                                                    break;
                                                case 30:
                                                    oooO0OO = oooO00oOooO0OO.f88097OoooO0O;
                                                    break;
                                                case 31:
                                                    oooO0OO = oooO00oOooO0OO.f88094OoooO;
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 33:
                                                            oooO0OO = oooO00oOooO0OO.f88098OoooOO0;
                                                            break;
                                                        case 34:
                                                            oooO0OO = oooO00oOooO0OO.f88104o000oOoO;
                                                            break;
                                                        case 35:
                                                            oooO0OO = oooO00oOooO0OO.f88100OoooOOo;
                                                            break;
                                                        case 36:
                                                            oooO0OO = oooO00oOooO0OO.f88058OooO0o0;
                                                            break;
                                                        case 37:
                                                            throw new IllegalArgumentException("RegularUserFeature.FEATURE_CREATE_NOTE should not be used here");
                                                        case 38:
                                                            oooO0OO = oooO00oOooO0OO.f88061OooOO0;
                                                            break;
                                                        case 39:
                                                            oooO0OO = oooO00oOooO0OO.f88063OooOO0o;
                                                            break;
                                                        case 40:
                                                            oooO0OO = oooO00oOooO0OO.f88078OooOoOO;
                                                            break;
                                                        case 41:
                                                            oooO0OO = oooO00oOooO0OO.f88080OooOoo0;
                                                            break;
                                                        case 42:
                                                            oooO0OO = oooO00oOooO0OO.f88079OooOoo;
                                                            break;
                                                        case 43:
                                                            oooO0OO = oooO00oOooO0OO.f88081OooOooO;
                                                            break;
                                                        case 44:
                                                            oooO0OO = oooO00oOooO0OO.f88082OooOooo;
                                                            break;
                                                        case 45:
                                                            oooO0OO = oooO00oOooO0OO.f88088Oooo0O0;
                                                            break;
                                                        case 46:
                                                            oooO0OO = oooO00oOooO0OO.f88099OoooOOO;
                                                            break;
                                                        case 47:
                                                            oooO0OO = oooO00oOooO0OO.f88101OoooOo0;
                                                            break;
                                                        case 48:
                                                            oooO0OO = oooO00oOooO0OO.f88102OoooOoO;
                                                            break;
                                                        case 49:
                                                            oooO0OO = oooO00oOooO0OO.f88103OoooOoo;
                                                            break;
                                                        default:
                                                            oooO0OO = new OooO00o.OooO0OO(3);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    oooO0OO = oooO00oOooO0OO.f88095OoooO0;
                }
                if (z2) {
                    i4 = oooO0OO.f88106OooO00o;
                } else if (z) {
                    oooO0OO.getClass();
                } else {
                    i4 = oooO0OO.f88107OooO0O0;
                }
                return new Integer(i4);
            }
            String id = noteinFirebaseUser.getId();
            c27595o00ooOoo.f96906OooOo0o = c27597o00ooo00;
            c27595o00ooOoo.f96905OooOo = noteinFirebaseUser;
            c27595o00ooOoo.f96908OooOoO0 = i;
            c27595o00ooOoo.f96910OooOoo0 = 1;
            objOooOOO0 = c27597o00ooo00.f96919OooO0OO.OooOOO0(id, c27595o00ooOoo);
            if (objOooOOO0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c27595o00ooOoo.f96908OooOoO0;
            noteinFirebaseUser = c27595o00ooOoo.f96905OooOo;
            c27597o00ooo00 = c27595o00ooOoo.f96906OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOO0);
        }
        firebaseUserMembership = (FirebaseUserMembership) objOooOOO0;
        int i42 = 0;
        if ((firebaseUserMembership == null ? firebaseUserMembership.getMembershipType() : null) == FirebaseUserMembership.MembershipType.LIFE_TIME) {
        }
        if (noteinFirebaseUser == null) {
        }
        o0O.OooO00o oooO00oOooO0OO2 = c27597o00ooo00.f96920OooO0Oo.f95374OooO00o.OooO0OO(true);
        oooO00oOooO0OO2.getClass();
        if (i != 100) {
        }
        if (z2) {
        }
        return new Integer(i42);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(int i, NoteinFirebaseUser noteinFirebaseUser, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27587o00ooO0O c27587o00ooO0O;
        String id;
        o0O.OooO00o oooO00o;
        String str;
        C27597o00ooo00 c27597o00ooo00;
        int iIntValue;
        FirebaseUserMembership firebaseUserMembership;
        int i2;
        int i3;
        o0O.OooO00o oooO00o2;
        String str2;
        if (abstractC32479OooO0OO instanceof C27587o00ooO0O) {
            c27587o00ooO0O = (C27587o00ooO0O) abstractC32479OooO0OO;
            int i4 = c27587o00ooO0O.f96867OooOooo;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c27587o00ooO0O.f96867OooOooo = i4 - Integer.MIN_VALUE;
            } else {
                c27587o00ooO0O = new C27587o00ooO0O(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27587o00ooO0O.f96864OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i5 = c27587o00ooO0O.f96867OooOooo;
        boolean z = true;
        if (i5 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o0O.OooO00o oooO00oOooO0OO = this.f96920OooO0Oo.f95374OooO00o.OooO0OO(true);
            if (noteinFirebaseUser == null || (id = noteinFirebaseUser.getId()) == null) {
                id = "";
            }
            c27587o00ooO0O.f96860OooOo0o = this;
            c27587o00ooO0O.f96859OooOo = noteinFirebaseUser;
            c27587o00ooO0O.f96862OooOoO0 = oooO00oOooO0OO;
            c27587o00ooO0O.f96861OooOoO = id;
            c27587o00ooO0O.f96863OooOoOO = i;
            c27587o00ooO0O.f96867OooOooo = 1;
            Object objOooO0o0 = this.f96917OooO00o.OooO0o0(id, c27587o00ooO0O);
            if (objOooO0o0 != enumC32485OooO00o) {
                String str3 = id;
                oooO00o = oooO00oOooO0OO;
                obj = objOooO0o0;
                str = str3;
                c27597o00ooo00 = this;
            }
            return enumC32485OooO00o;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c27587o00ooO0O.f96865OooOoo0;
            i2 = c27587o00ooO0O.f96863OooOoOO;
            str2 = (String) c27587o00ooO0O.f96859OooOo;
            oooO00o2 = (o0O.OooO00o) c27587o00ooO0O.f96860OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            firebaseUserMembership = (FirebaseUserMembership) obj;
            iIntValue = i3;
            i = i2;
            oooO00o = oooO00o2;
            str = str2;
            if (firebaseUserMembership != null || (firebaseUserMembership.getMembershipType() != FirebaseUserMembership.MembershipType.LIFE_TIME && firebaseUserMembership.getMembershipType() != FirebaseUserMembership.MembershipType.SUBSCRIPTION)) {
                z = false;
            }
            int i6 = (iIntValue <= oooO00o.f88053OooO00o && !z) ? 4 : 0;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "VipFeatureUseCase", "doesAllowToAddMoreNotes: userId: ", str, ", newNotesCount: ");
            sbOooO00o.append(i);
            sbOooO00o.append(", result: ");
            sbOooO00o.append(i6);
            c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
            return new Integer(i6);
        }
        i = c27587o00ooO0O.f96863OooOoOO;
        String str4 = c27587o00ooO0O.f96861OooOoO;
        oooO00o = c27587o00ooO0O.f96862OooOoO0;
        NoteinFirebaseUser noteinFirebaseUser2 = (NoteinFirebaseUser) c27587o00ooO0O.f96859OooOo;
        c27597o00ooo00 = (C27597o00ooo00) c27587o00ooO0O.f96860OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        str = str4;
        noteinFirebaseUser = noteinFirebaseUser2;
        iIntValue = ((Number) obj).intValue() + i;
        firebaseUserMembership = null;
        if (noteinFirebaseUser != null) {
            InterfaceC27300OooOOOo interfaceC27300OooOOOo = c27597o00ooo00.f96919OooO0OO;
            String id2 = noteinFirebaseUser.getId();
            c27587o00ooO0O.f96860OooOo0o = oooO00o;
            c27587o00ooO0O.f96859OooOo = str;
            c27587o00ooO0O.f96862OooOoO0 = null;
            c27587o00ooO0O.f96861OooOoO = null;
            c27587o00ooO0O.f96863OooOoOO = i;
            c27587o00ooO0O.f96865OooOoo0 = iIntValue;
            c27587o00ooO0O.f96867OooOooo = 2;
            Object objOooOOO0 = interfaceC27300OooOOOo.OooOOO0(id2, c27587o00ooO0O);
            if (objOooOOO0 != enumC32485OooO00o) {
                i2 = i;
                i3 = iIntValue;
                obj = objOooOOO0;
                oooO00o2 = oooO00o;
                str2 = str;
                firebaseUserMembership = (FirebaseUserMembership) obj;
                iIntValue = i3;
                i = i2;
                oooO00o = oooO00o2;
                str = str2;
            }
            return enumC32485OooO00o;
        }
        if (firebaseUserMembership != null) {
            z = false;
        }
        if (iIntValue <= oooO00o.f88053OooO00o) {
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO00o2 = C22227OoooO.OooO00o(c20358OooO00o2, "VipFeatureUseCase", "doesAllowToAddMoreNotes: userId: ", str, ", newNotesCount: ");
        sbOooO00o2.append(i);
        sbOooO00o2.append(", result: ");
        sbOooO00o2.append(i6);
        c20358OooO00o2.OooO0o0(sbOooO00o2.toString(), new Object[0]);
        return new Integer(i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27588o00ooO0o c27588o00ooO0o;
        C27597o00ooo00 c27597o00ooo00;
        if (abstractC32479OooO0OO instanceof C27588o00ooO0o) {
            c27588o00ooO0o = (C27588o00ooO0o) abstractC32479OooO0OO;
            int i2 = c27588o00ooO0o.f96872OooOoOO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27588o00ooO0o.f96872OooOoOO = i2 - Integer.MIN_VALUE;
            } else {
                c27588o00ooO0o = new C27588o00ooO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = c27588o00ooO0o.f96871OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c27588o00ooO0o.f96872OooOoOO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            c27588o00ooO0o.f96869OooOo0o = this;
            c27588o00ooO0o.f96868OooOo = i;
            c27588o00ooO0o.f96872OooOoOO = 1;
            objOooO0OO = this.f96918OooO0O0.OooO0OO(c27588o00ooO0o);
            if (objOooO0OO != enumC32485OooO00o) {
                c27597o00ooo00 = this;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0OO);
            return objOooO0OO;
        }
        i = c27588o00ooO0o.f96868OooOo;
        c27597o00ooo00 = c27588o00ooO0o.f96869OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0OO);
        c27588o00ooO0o.f96869OooOo0o = null;
        c27588o00ooO0o.f96872OooOoOO = 2;
        Object objOooO0O0 = c27597o00ooo00.OooO0O0(i, (NoteinFirebaseUser) objOooO0OO, c27588o00ooO0o);
        return objOooO0O0 == enumC32485OooO00o ? enumC32485OooO00o : objOooO0O0;
    }

    public final AiFeatureConfig OooO0Oo() {
        o00000O o00000o = this.f96920OooO0Oo;
        o00000o.getClass();
        return o00000o.f95374OooO00o.OooO0Oo();
    }

    public final Object OooO0o(int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27592o00ooOo(this, i, null), abstractC32479OooO0OO);
    }

    public final InterfaceC33721OooO0o<Integer> OooO0o0(int i) {
        C27591o00ooOOo c27591o00ooOOo = new C27591o00ooOOo(C25252OooO0Oo.OooOoO(this.f96918OooO0O0.OooO0o0(), new C27589o00ooOO(null, this)), this, i);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C25252OooO0Oo.OooOo0O(c27591o00ooOOo, ExecutorC33873OooO0O0.f122045OooOoO0);
    }
}
