package o0OoOOO0;

import android.graphics.Typeface;
import com.orion.notein.global.R;
import com.orion.notein.richeditor.fonts.FontManager;
import com.orion.notein.richeditor.fonts.RTTypeface;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import o000OoO.C24536OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0oOoOo.C31087Oooooo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OoOOO0.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextBoxViewModel$textFontVOList$1", m80623f = "TextBoxViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29080Oooo0O0 extends AbstractC32476OooO implements oO0O000o.OooOo00<List<? extends RTTypeface>, String, String, Boolean, List<? extends String>, Continuation<? super List<? extends C31087Oooooo0>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ String f103053OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f103054OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ boolean f103055OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ String f103056OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ List f103057OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ AbstractApplicationC26277OooOoOO f103058OooOoo0;

    /* JADX INFO: renamed from: o0OoOOO0.Oooo0O0$OooO00o */
    public static final class OooO00o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(((C31087Oooooo0) t).f110946OooO00o, ((C31087Oooooo0) t2).f110946OooO00o);
        }
    }

    /* JADX INFO: renamed from: o0OoOOO0.Oooo0O0$OooO0O0 */
    public static final class OooO0O0<T> implements Comparator {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ AbstractApplicationC26277OooOoOO f103059OooOo0o;

        public OooO0O0(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
            this.f103059OooOo0o = abstractApplicationC26277OooOoOO;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            String string;
            String lowerCase;
            String string2;
            C31087Oooooo0 c31087Oooooo0 = (C31087Oooooo0) t;
            int length = c31087Oooooo0.f110946OooO00o.length();
            AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = this.f103059OooOo0o;
            String lowerCase2 = "";
            if (length == 0) {
                lowerCase = "";
            } else {
                Integer num = c31087Oooooo0.f110952OooO0oO;
                if (num == null || (string = abstractApplicationC26277OooOoOO.getString(num.intValue())) == null) {
                    string = c31087Oooooo0.f110946OooO00o;
                }
                lowerCase = string.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
            }
            C31087Oooooo0 c31087Oooooo02 = (C31087Oooooo0) t2;
            if (c31087Oooooo02.f110946OooO00o.length() != 0) {
                Integer num2 = c31087Oooooo02.f110952OooO0oO;
                if (num2 == null || (string2 = abstractApplicationC26277OooOoOO.getString(num2.intValue())) == null) {
                    string2 = c31087Oooooo02.f110946OooO00o;
                }
                lowerCase2 = string2.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase2, "toLowerCase(...)");
            }
            return C24536OooO0Oo.OooO0O0(lowerCase, lowerCase2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29080Oooo0O0(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, Continuation continuation) {
        super(6, continuation);
        this.f103058OooOoo0 = abstractApplicationC26277OooOoOO;
    }

    @Override // oO0O000o.OooOo00
    public final Object Oooo0OO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Serializable serializable) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        C29080Oooo0O0 c29080Oooo0O0 = new C29080Oooo0O0(this.f103058OooOoo0, (Continuation) serializable);
        c29080Oooo0O0.f103054OooOo0o = (List) obj;
        c29080Oooo0O0.f103053OooOo = (String) obj2;
        c29080Oooo0O0.f103056OooOoO0 = (String) obj3;
        c29080Oooo0O0.f103055OooOoO = zBooleanValue;
        c29080Oooo0O0.f103057OooOoOO = (List) obj5;
        return c29080Oooo0O0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f103054OooOo0o;
        String str = this.f103053OooOo;
        String str2 = this.f103056OooOoO0;
        boolean z = this.f103055OooOoO;
        List list2 = this.f103057OooOoOO;
        ArrayList<C31087Oooooo0> arrayList = new ArrayList();
        List<RTTypeface> list3 = list;
        int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list3, 10));
        if (iOooO0Oo < 16) {
            iOooO0Oo = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
        for (RTTypeface rTTypeface : list3) {
            linkedHashMap.put(rTTypeface.getName(), rTTypeface.getTypeface());
        }
        arrayList.add(new C31087Oooooo0("", null, new Integer(4), false, null, z, 64));
        List<String> customFontNames = FontManager.getCustomFontNames();
        kotlin.jvm.internal.OooOOO0.OooO0o(customFontNames, "getCustomFontNames(...)");
        List<String> list4 = customFontNames;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
        for (String str3 : list4) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(str3);
            arrayList2.add(new C31087Oooooo0(str3, (Typeface) linkedHashMap.get(str3), null, true, null, false, 192));
        }
        List listO00O0O = oOo000Oo.OooOo.o00O0O(arrayList2, new OooO00o());
        if (!listO00O0O.isEmpty()) {
            arrayList.add(new C31087Oooooo0("", null, new Integer(3), false, null, false, 192));
        }
        arrayList.addAll(listO00O0O);
        arrayList.add(new C31087Oooooo0("", null, new Integer(0), false, null, false, 192));
        arrayList.add(new C31087Oooooo0("", Typeface.DEFAULT, null, false, new Integer(R.string.default_font), false, 128));
        arrayList.add(new C31087Oooooo0("", null, new Integer(1), false, null, false, 192));
        String[] REMOTE_CHINESE_FONTS = FontManager.REMOTE_CHINESE_FONTS;
        kotlin.jvm.internal.OooOOO0.OooO0o(REMOTE_CHINESE_FONTS, "REMOTE_CHINESE_FONTS");
        ArrayList<String> arrayList3 = new ArrayList();
        for (String str4 : REMOTE_CHINESE_FONTS) {
            if (!list2.contains(str4)) {
                arrayList3.add(str4);
            }
        }
        ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
        for (String str5 : arrayList3) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(str5);
            arrayList4.add(new C31087Oooooo0(str5, (Typeface) linkedHashMap.get(str5), null, false, null, false, 192));
        }
        arrayList.addAll(arrayList4);
        arrayList.add(new C31087Oooooo0("", null, new Integer(2), false, null, false, 192));
        String[] REMOTE_ENGLISH_FONTS = FontManager.REMOTE_ENGLISH_FONTS;
        kotlin.jvm.internal.OooOOO0.OooO0o(REMOTE_ENGLISH_FONTS, "REMOTE_ENGLISH_FONTS");
        ArrayList<String> arrayList5 = new ArrayList();
        for (String str6 : REMOTE_ENGLISH_FONTS) {
            if (!list2.contains(str6)) {
                arrayList5.add(str6);
            }
        }
        ArrayList arrayList6 = new ArrayList(C34428OooOOo.OooOOoo(arrayList5, 10));
        for (String str7 : arrayList5) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(str7);
            arrayList6.add(new C31087Oooooo0(str7, (Typeface) linkedHashMap.get(str7), null, false, C31087Oooooo0.OooO00o.OooO00o(str7), false, 128));
        }
        arrayList.addAll(arrayList6);
        ArrayList arrayList7 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        for (C31087Oooooo0 c31087Oooooo0 : arrayList) {
            boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(c31087Oooooo0.f110946OooO00o, str2);
            String name = c31087Oooooo0.f110946OooO00o;
            boolean zOooO0O02 = kotlin.jvm.internal.OooOOO0.OooO0O0(name, str);
            kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
            arrayList7.add(new C31087Oooooo0(name, c31087Oooooo0.f110947OooO0O0, zOooO0O0, zOooO0O02, c31087Oooooo0.f110951OooO0o0, c31087Oooooo0.f110950OooO0o, c31087Oooooo0.f110952OooO0oO, c31087Oooooo0.f110953OooO0oo));
        }
        return oOo000Oo.OooOo.o00O0O(arrayList7, new OooO0O0(this.f103058OooOoo0));
    }
}
