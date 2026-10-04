package com.orion.notein.p607ui.user.message;

import Oooo0.C20860Ooooooo;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC21486OooOO0o;
import androidx.core.os.LocaleListCompat;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.global.R;
import io.ktor.utils.p616io.Oooo000;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import o0O0oooO.C26305OooooO0;
import o0Oo0o0o.ViewOnClickListenerC28232OooOO0;
import o0oOoOo.C31057OooOoo0;
import oO00ooO.C32443OooOOO;
import oO00ooOO.C32466OooO0OO;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o extends AbstractC22050OooOo0o<C31057OooOoo0, RecyclerView.AbstractC22078OooOooO> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public InterfaceC23874OooO0Oo f79784OooO0O0;

    /* JADX INFO: renamed from: com.orion.notein.ui.user.message.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19549OooO00o extends OooOOO.AbstractC22036OooO0o0<C31057OooOoo0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C19549OooO00o f79785OooO00o = new C19549OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31057OooOoo0 c31057OooOoo0, C31057OooOoo0 c31057OooOoo02) {
            return c31057OooOoo0.equals(c31057OooOoo02);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31057OooOoo0 c31057OooOoo0, C31057OooOoo0 c31057OooOoo02) {
            return OooOOO0.OooO0O0(c31057OooOoo0.f110879OooO00o, c31057OooOoo02.f110879OooO00o);
        }
    }

    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {
        public OooO0O0() {
            throw null;
        }
    }

    public final class OooO0OO extends RecyclerView.AbstractC22078OooOooO {
        public OooO0OO() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.message.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public interface InterfaceC23874OooO0Oo {
        void OooO00o(C31057OooOoo0 c31057OooOoo0, String str);

        void OooO0O0(View view);
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.message.OooO00o$OooO0o0, reason: case insensitive filesystem */
    public final class C23875OooO0o0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SimpleDateFormat f79786OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f79787OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f79788OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final TextView f79789OooO0Oo;

        public C23875OooO0o0(View view) {
            super(view);
            this.f79786OooO00o = new SimpleDateFormat("YY/MM/dd");
            View viewFindViewById = view.findViewById(R.id.tv_title);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f79787OooO0O0 = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.tv_content);
            OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            this.f79788OooO0OO = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.tv_creation_time);
            OooOOO0.OooO0o(viewFindViewById3, "findViewById(...)");
            this.f79789OooO0Oo = (TextView) viewFindViewById3;
            view.setOnClickListener(new ViewOnClickListenerC28232OooOO0(OooO00o.this, 4));
        }

        public static String OooO00o(Map map, Locale locale) {
            String string;
            if (map.isEmpty()) {
                return null;
            }
            C32466OooO0OO c32466OooO0OO = new C32466OooO0OO(map.size());
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Map mapOooO0oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO("enUS", "en-US"), new C32443OooOOO("zhCN", "zh-CN"), new C32443OooOOO("zhTW", "zh-TW"), new C32443OooOOO("en-us", "en-US"), new C32443OooOOO("zh-cn", "zh-CN"), new C32443OooOOO("zh-tw", "zh-TW"));
                String strOooOo0 = C33595OooOOo.OooOo0(str, '_', '-');
                String lowerCase = (String) mapOooO0oo.get(strOooOo0);
                if (lowerCase == null) {
                    List listO000oOoO = C33599OooOo0O.o000oOoO(strOooOo0, new char[]{'-'});
                    int size = listO000oOoO.size();
                    if (size == 1) {
                        lowerCase = ((String) listO000oOoO.get(0)).toLowerCase(Locale.ROOT);
                        OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
                    } else if (size != 2) {
                        lowerCase = OooOo.o000oOoO(listO000oOoO, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, null, null, new C26305OooooO0(2), 30);
                    } else {
                        String str3 = (String) listO000oOoO.get(0);
                        Locale locale2 = Locale.ROOT;
                        String lowerCase2 = str3.toLowerCase(locale2);
                        OooOOO0.OooO0o(lowerCase2, "toLowerCase(...)");
                        String upperCase = ((String) listO000oOoO.get(1)).toUpperCase(locale2);
                        OooOOO0.OooO0o(upperCase, "toUpperCase(...)");
                        lowerCase = lowerCase2 + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + upperCase;
                    }
                }
                c32466OooO0OO.put(lowerCase, str2);
            }
            C32466OooO0OO c32466OooO0OOOooO0O0 = c32466OooO0OO.OooO0O0();
            String language = locale.getLanguage();
            OooOOO0.OooO0o(language, "getLanguage(...)");
            Locale locale3 = Locale.ROOT;
            String lowerCase3 = language.toLowerCase(locale3);
            OooOOO0.OooO0o(lowerCase3, "toLowerCase(...)");
            String country = locale.getCountry();
            OooOOO0.OooO0o(country, "getCountry(...)");
            String upperCase2 = country.toUpperCase(locale3);
            OooOOO0.OooO0o(upperCase2, "toUpperCase(...)");
            try {
                string = locale.getScript();
            } catch (Throwable unused) {
                string = "";
            }
            ArrayList arrayList = new ArrayList();
            if (lowerCase3.length() > 0 && upperCase2.length() > 0) {
                arrayList.add(lowerCase3 + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + upperCase2);
            }
            if (lowerCase3.equals(TranslateLanguage.CHINESE) && string != null && string.length() != 0) {
                if (string.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) Oooo000.OooO0o(string.charAt(0)));
                    String strSubstring = string.substring(1);
                    OooOOO0.OooO0o(strSubstring, "substring(...)");
                    sb.append(strSubstring);
                    string = sb.toString();
                }
                arrayList.add(lowerCase3 + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + string);
            }
            if (lowerCase3.equals(TranslateLanguage.CHINESE) && (upperCase2.equals("TW") || upperCase2.equals("HK") || upperCase2.equals("MO"))) {
                arrayList.add("zh-TW");
            }
            if (lowerCase3.equals(TranslateLanguage.CHINESE) && upperCase2.equals("CN")) {
                arrayList.add("zh-CN");
            }
            Set setKeySet = c32466OooO0OOOooO0O0.keySet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : setKeySet) {
                if (C33595OooOOo.OooOoO0((String) obj, lowerCase3.concat(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR), false)) {
                    arrayList2.add(obj);
                }
            }
            Iterator it = OooOo.ooOO(arrayList2).iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            arrayList.add(lowerCase3);
            C34431OooOo0.OooOo0o(arrayList, C34429OooOOo0.OooOO0o("en-US", TranslateLanguage.ENGLISH));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str4 = (String) c32466OooO0OOOooO0O0.get((String) it2.next());
                if (str4 != null && str4.length() > 0) {
                    return str4;
                }
            }
            return null;
        }
    }

    public OooO00o() {
        super(C19549OooO00o.f79785OooO00o);
    }

    @Override // androidx.recyclerview.widget.AbstractC22050OooOo0o, androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemCount() {
        return super.getItemCount() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemViewType(int i) {
        if (super.getItemCount() == 0) {
            return 2;
        }
        return i == getItemCount() - 1 ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO holder, int i) {
        OooOOO0.OooO0oO(holder, "holder");
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            if (itemViewType == 1) {
                return;
            }
            if (itemViewType != 2) {
                return;
            }
            OooO0O0 oooO0O0 = (OooO0O0) holder;
            TextView textView = (TextView) oooO0O0.itemView.findViewById(R.id.tv_no_more);
            if (textView != null) {
                textView.setText(oooO0O0.itemView.getContext().getString(R.string.message_no_more));
                return;
            }
            return;
        }
        C23875OooO0o0 c23875OooO0o0 = (C23875OooO0o0) holder;
        C31057OooOoo0 c31057OooOoo0OooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c31057OooOoo0OooO0OO, "getItem(...)");
        C31057OooOoo0 c31057OooOoo0 = c31057OooOoo0OooO0OO;
        c23875OooO0o0.itemView.setTag(c31057OooOoo0);
        LocaleListCompat localeListCompatOooO0o = AbstractC21486OooOO0o.OooO0o();
        OooOOO0.OooO0o(localeListCompatOooO0o, "getApplicationLocales(...)");
        Locale locale = !localeListCompatOooO0o.isEmpty() ? localeListCompatOooO0o.get(0) : Locale.getDefault();
        Locale locale2 = locale == null ? Locale.getDefault() : locale;
        OooOOO0.OooO0Oo(locale2);
        String strOooO00o = C23875OooO0o0.OooO00o(c31057OooOoo0.f110881OooO0OO, locale2);
        if (strOooO00o == null) {
            strOooO00o = "";
        }
        c23875OooO0o0.f79787OooO0O0.setText(strOooO00o);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        OooOOO0.OooO0Oo(locale);
        String strOooO00o2 = C23875OooO0o0.OooO00o(c31057OooOoo0.f110882OooO0Oo, locale);
        Spanned spannedFromHtml = Html.fromHtml(strOooO00o2 != null ? strOooO00o2 : "", 63);
        OooOOO0.OooO0o(spannedFromHtml, "fromHtml(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        Object[] spans = spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        OooOOO0.OooO0o(spans, "getSpans(...)");
        for (URLSpan uRLSpan : (URLSpan[]) spans) {
            spannableStringBuilder.setSpan(new com.orion.notein.p607ui.user.message.OooO0O0(uRLSpan, OooO00o.this, c23875OooO0o0), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
            spannableStringBuilder.removeSpan(uRLSpan);
        }
        TextView textView2 = c23875OooO0o0.f79788OooO0OO;
        textView2.setText(spannableStringBuilder);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        c23875OooO0o0.f79789OooO0Oo.setText(c23875OooO0o0.f79786OooO00o.format(Long.valueOf(c31057OooOoo0.f110883OooO0o0)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) {
        OooOOO0.OooO0oO(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (i == 0) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_user_messages, parent, false);
            OooOOO0.OooO0Oo(viewInflate);
            return new C23875OooO0o0(viewInflate);
        }
        if (i == 1) {
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.item_no_more_user_messages, parent, false);
            OooOOO0.OooO0Oo(viewInflate2);
            return new OooO0OO(viewInflate2);
        }
        if (i == 2) {
            View viewInflate3 = layoutInflaterFrom.inflate(R.layout.item_no_more_user_messages, parent, false);
            OooOOO0.OooO0Oo(viewInflate3);
            return new OooO0O0(viewInflate3);
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOO0O(C20860Ooooooo.OooO0OO(c20358OooO00o, "NoteinMessageListAdapter", "Unknown view type: ", i), new Object[0]);
        View viewInflate4 = layoutInflaterFrom.inflate(R.layout.item_user_messages, parent, false);
        OooOOO0.OooO0Oo(viewInflate4);
        return new C23875OooO0o0(viewInflate4);
    }
}
