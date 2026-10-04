package oo0oO0;

import com.orion.notein.data.p602db.entity.NoteSortKeyUpdateEntity;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: oo0oO0.o00oOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC34938o00oOoo {

    /* JADX INFO: renamed from: oo0oO0.o00oOoo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.db.dao.NoteAndFolderSortDao", m80623f = "NoteAndFolderSortDao.kt", m80624l = {49, 51, 54, 56}, m80625m = "getNextSortKey$suspendImpl")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public String f125530OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public AbstractC34938o00oOoo f125531OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f125532OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public String f125533OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public /* synthetic */ Object f125534OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public int f125535OooOoo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f125534OooOoOO = obj;
            this.f125535OooOoo |= Integer.MIN_VALUE;
            return AbstractC34938o00oOoo.OooO0o(AbstractC34938o00oOoo.this, null, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r13 == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r13 == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        if (r13 == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c2, code lost:
    
        if (r13 == r2) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object OooO0o(AbstractC34938o00oOoo abstractC34938o00oOoo, String str, String str2, Continuation<? super Integer> continuation) {
        OooO00o oooO00o;
        int iIntValue;
        AbstractC34938o00oOoo abstractC34938o00oOoo2;
        int i;
        String str3;
        String str4;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i2 = oooO00o.f125535OooOoo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO00o.f125535OooOoo = i2 - Integer.MIN_VALUE;
            } else {
                oooO00o = abstractC34938o00oOoo.new OooO00o(continuation);
            }
        }
        Object objOooO0Oo = oooO00o.f125534OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = oooO00o.f125535OooOoo;
        int iIntValue2 = 0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            if (str == null) {
                oooO00o.f125531OooOo0o = abstractC34938o00oOoo;
                oooO00o.f125530OooOo = str;
                oooO00o.f125533OooOoO0 = str2;
                oooO00o.f125535OooOoo = 1;
                objOooO0Oo = abstractC34938o00oOoo.OooO0OO(str2, oooO00o);
            } else {
                oooO00o.f125531OooOo0o = abstractC34938o00oOoo;
                oooO00o.f125530OooOo = str;
                oooO00o.f125533OooOoO0 = str2;
                oooO00o.f125535OooOoo = 2;
                objOooO0Oo = abstractC34938o00oOoo.OooO0Oo(str, str2, oooO00o);
            }
            return enumC32485OooO00o;
        }
        if (i3 == 1) {
            str2 = oooO00o.f125533OooOoO0;
            str = oooO00o.f125530OooOo;
            abstractC34938o00oOoo = oooO00o.f125531OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            Integer num = (Integer) objOooO0Oo;
            if (num != null) {
                iIntValue = num.intValue();
                String str5 = str;
                abstractC34938o00oOoo2 = abstractC34938o00oOoo;
                i = iIntValue;
                str3 = str2;
                str4 = str5;
            }
            str3 = str2;
            str4 = str;
            abstractC34938o00oOoo2 = abstractC34938o00oOoo;
            i = 0;
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    i = oooO00o.f125532OooOoO;
                    C32446OooOOOo.OooO0O0(objOooO0Oo);
                    Integer num2 = (Integer) objOooO0Oo;
                    if (num2 != null) {
                        iIntValue2 = num2.intValue();
                    }
                    int iMin = Math.min(i, iIntValue2);
                    return new Integer(iMin != Integer.MIN_VALUE ? iMin - 1 : Integer.MIN_VALUE);
                }
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = oooO00o.f125532OooOoO;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                Integer num3 = (Integer) objOooO0Oo;
                if (num3 != null) {
                    iIntValue2 = num3.intValue();
                }
                int iMin2 = Math.min(i, iIntValue2);
                return new Integer(iMin2 != Integer.MIN_VALUE ? iMin2 - 1 : Integer.MIN_VALUE);
            }
            str2 = oooO00o.f125533OooOoO0;
            str = oooO00o.f125530OooOo;
            abstractC34938o00oOoo = oooO00o.f125531OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            Integer num4 = (Integer) objOooO0Oo;
            if (num4 != null) {
                iIntValue = num4.intValue();
                String str52 = str;
                abstractC34938o00oOoo2 = abstractC34938o00oOoo;
                i = iIntValue;
                str3 = str2;
                str4 = str52;
            }
            str3 = str2;
            str4 = str;
            abstractC34938o00oOoo2 = abstractC34938o00oOoo;
            i = 0;
        }
        if (str4 == null) {
            oooO00o.f125531OooOo0o = null;
            oooO00o.f125530OooOo = null;
            oooO00o.f125533OooOoO0 = null;
            oooO00o.f125532OooOoO = i;
            oooO00o.f125535OooOoo = 3;
            objOooO0Oo = abstractC34938o00oOoo2.OooO00o(str3, oooO00o);
        } else {
            oooO00o.f125531OooOo0o = null;
            oooO00o.f125530OooOo = null;
            oooO00o.f125533OooOoO0 = null;
            oooO00o.f125532OooOoO = i;
            oooO00o.f125535OooOoo = 4;
            objOooO0Oo = abstractC34938o00oOoo2.OooO0O0(str4, str3, oooO00o);
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object OooOO0(AbstractC34938o00oOoo abstractC34938o00oOoo, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, Continuation continuation) {
        o00O000 o00o0002;
        AbstractC34938o00oOoo abstractC34938o00oOoo2;
        Iterator it;
        Map map;
        Iterator it2;
        if (continuation instanceof o00O000) {
            o00o0002 = (o00O000) continuation;
            int i = o00o0002.f125250OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00o0002.f125250OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                o00o0002 = new o00O000(abstractC34938o00oOoo, continuation);
            }
        }
        Object obj = o00o0002.f125247OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00o0002.f125250OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Iterator it3 = linkedHashMap.entrySet().iterator();
            abstractC34938o00oOoo2 = abstractC34938o00oOoo;
            it = it3;
            map = linkedHashMap2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it2 = (Iterator) o00o0002.f125245OooOo;
                abstractC34938o00oOoo2 = o00o0002.f125246OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    NoteSortKeyUpdateEntity noteSortKeyUpdateEntity = new NoteSortKeyUpdateEntity((String) entry.getKey(), ((Number) entry.getValue()).intValue());
                    o00o0002.f125246OooOo0o = abstractC34938o00oOoo2;
                    o00o0002.f125245OooOo = it2;
                    o00o0002.f125248OooOoO0 = null;
                    o00o0002.f125250OooOoo0 = 2;
                    if (abstractC34938o00oOoo2.OooO0oO(noteSortKeyUpdateEntity, o00o0002) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
            it = o00o0002.f125248OooOoO0;
            Map map2 = (Map) o00o0002.f125245OooOo;
            AbstractC34938o00oOoo abstractC34938o00oOoo3 = o00o0002.f125246OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            map = map2;
            abstractC34938o00oOoo2 = abstractC34938o00oOoo3;
        }
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            NoteSortKeyUpdateEntity noteSortKeyUpdateEntity2 = new NoteSortKeyUpdateEntity((String) entry2.getKey(), ((Number) entry2.getValue()).intValue());
            o00o0002.f125246OooOo0o = abstractC34938o00oOoo2;
            o00o0002.f125245OooOo = map;
            o00o0002.f125248OooOoO0 = it;
            o00o0002.f125250OooOoo0 = 1;
            if (abstractC34938o00oOoo2.OooO0oo(noteSortKeyUpdateEntity2, o00o0002) == enumC32485OooO00o) {
                break;
            }
        }
        it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
        }
        return C32460OooOooO.f116667OooO00o;
    }

    public Object OooO(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, o0o00oOo.o00000OO o00000oo2) {
        return OooOO0(this, linkedHashMap, linkedHashMap2, o00000oo2);
    }

    public abstract Object OooO00o(String str, OooO00o oooO00o);

    public abstract Object OooO0O0(String str, String str2, OooO00o oooO00o);

    public abstract Object OooO0OO(String str, OooO00o oooO00o);

    public abstract Object OooO0Oo(String str, String str2, OooO00o oooO00o);

    public Object OooO0o0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return OooO0o(this, str, str2, abstractC32479OooO0OO);
    }

    public abstract Object OooO0oO(NoteSortKeyUpdateEntity noteSortKeyUpdateEntity, o00O000 o00o0002);

    public abstract Object OooO0oo(NoteSortKeyUpdateEntity noteSortKeyUpdateEntity, o00O000 o00o0002);
}
