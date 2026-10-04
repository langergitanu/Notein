package com.hbb20;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.aspose.slides.C22226Oooo0oo;
import com.aspose.slides.PatternStyle;
import com.aspose.words.EditingLanguage;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.eststelemetry.PublicApiId;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import oO00OoO0.C32281OooO00o;
import oO00OoO0.C32284OooO0Oo;
import oO00OoO0.C32285OooO0o0;
import oO00OoO0.C32287OooO0oo;

/* JADX INFO: loaded from: classes8.dex */
public class CountryCodePicker extends RelativeLayout {

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public static final /* synthetic */ int f68744o00Ooo = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public View f68745OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f68746OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public EditText f68747OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public TextView f68748OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public RelativeLayout f68749OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public com.hbb20.OooO00o f68750OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public ImageView f68751OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public com.hbb20.OooO00o f68752OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public OooOO0 f68753OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f68754Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f68755Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public String f68756Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public OooO0O0 f68757Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f68758Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f68759Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f68760Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f68761Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f68762Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public EnumC22818OooO0oo f68763Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f68764Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public String f68765OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f68766OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Typeface f68767OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public List<com.hbb20.OooO00o> f68768OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public String f68769OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public OooO0o f68770OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f68771OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f68772OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public C22819OooO0Oo f68773OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public p618o0.OooO0O0 f68774OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public TextWatcher f68775Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f68776Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public String f68777OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f68778OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f68779OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f68780Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f68781Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int f68782OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public int f68783Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public OooO0o f68784o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public float f68785o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public com.hbb20.OooO0O0 f68786o00Oo0;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public int f68787o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public int f68788ooOO;

    public interface OooO {
        void OooO00o();
    }

    public class OooO00o implements TextWatcher {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public String f68790OooOo0o = null;

        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            CountryCodePicker countryCodePicker = CountryCodePicker.this;
            com.hbb20.OooO00o selectedCountry = countryCodePicker.getSelectedCountry();
            if (selectedCountry != null) {
                String str = this.f68790OooOo0o;
                if ((str == null || !str.equals(charSequence.toString())) && countryCodePicker.f68776Ooooo0o) {
                    if (countryCodePicker.f68786o00Oo0 != null) {
                        String string = countryCodePicker.getEditText_registeredCarrierNumber().getText().toString();
                        if (string.length() >= countryCodePicker.f68786o00Oo0.f68810OooO0O0) {
                            String strOooOOo = C32285OooO0o0.OooOOo(string);
                            int length = strOooOOo.length();
                            int i4 = countryCodePicker.f68786o00Oo0.f68810OooO0O0;
                            if (length >= i4) {
                                String strSubstring = strOooOOo.substring(0, i4);
                                if (!strSubstring.equals(countryCodePicker.f68777OooooO0)) {
                                    com.hbb20.OooO00o OooO00o2 = countryCodePicker.f68786o00Oo0.OooO00o(null, countryCodePicker.getLanguageToApply(), strSubstring);
                                    if (!OooO00o2.equals(selectedCountry)) {
                                        countryCodePicker.f68779OooooOo = true;
                                        countryCodePicker.f68778OooooOO = Selection.getSelectionEnd(charSequence);
                                        countryCodePicker.setSelectedCountry(OooO00o2);
                                    }
                                    countryCodePicker.f68777OooooO0 = strSubstring;
                                }
                            }
                        }
                    }
                    this.f68790OooOo0o = charSequence.toString();
                }
            }
        }
    }

    public enum OooO0O0 {
        /* JADX INFO: Fake field, exist only in values array */
        SIM_ONLY("1"),
        /* JADX INFO: Fake field, exist only in values array */
        NETWORK_ONLY("2"),
        /* JADX INFO: Fake field, exist only in values array */
        LOCALE_ONLY("3"),
        /* JADX INFO: Fake field, exist only in values array */
        SIM_NETWORK("12"),
        /* JADX INFO: Fake field, exist only in values array */
        NETWORK_SIM(PublicApiId.PCA_ACQUIRE_TOKEN_SILENT_WITH_PARAMETERS),
        /* JADX INFO: Fake field, exist only in values array */
        SIM_LOCALE("13"),
        /* JADX INFO: Fake field, exist only in values array */
        LOCALE_SIM(PublicApiId.MULTIPLE_ACCOUNT_PCA_ACQUIRE_TOKEN_SILENT_ASYNC_WITH_PARAMETERS),
        /* JADX INFO: Fake field, exist only in values array */
        NETWORK_LOCALE(PublicApiId.SINGLE_ACCOUNT_PCA_ACQUIRE_TOKEN_SILENT_WITH_PARAMETERS),
        /* JADX INFO: Fake field, exist only in values array */
        LOCALE_NETWORK("32"),
        /* JADX INFO: Fake field, exist only in values array */
        SIM_NETWORK_LOCALE(PublicApiId.SINGLE_ACCOUNT_PCA_SIGN_IN),
        /* JADX INFO: Fake field, exist only in values array */
        SIM_LOCALE_NETWORK(PublicApiId.SINGLE_ACCOUNT_PCA_SIGN_IN_WITH_PARAMETERS),
        /* JADX INFO: Fake field, exist only in values array */
        NETWORK_SIM_LOCALE(PublicApiId.NATIVE_AUTH_SIGN_IN_RESEND_CODE),
        /* JADX INFO: Fake field, exist only in values array */
        NETWORK_LOCALE_SIM(PublicApiId.NATIVE_AUTH_SIGN_UP_START),
        /* JADX INFO: Fake field, exist only in values array */
        LOCALE_SIM_NETWORK("312"),
        /* JADX INFO: Fake field, exist only in values array */
        LOCALE_NETWORK_SIM("321");


        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final String f68792OooOo0o;

        OooO0O0(String str) {
            this.f68792OooOo0o = str;
        }
    }

    public interface OooO0OO {
    }

    /* JADX INFO: renamed from: com.hbb20.CountryCodePicker$OooO0Oo, reason: case insensitive filesystem */
    public interface InterfaceC22815OooO0Oo {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OooO0o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final /* synthetic */ OooO0o[] f68793OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0o f68794OooOo0o;

        /* JADX INFO: Fake field, exist only in values array */
        OooO0o EF1;

        static {
            OooO0o oooO0o = new OooO0o("AFRIKAANS", 0);
            OooO0o oooO0o2 = new OooO0o("ARABIC", 1);
            OooO0o oooO0o3 = new OooO0o("BENGALI", 2);
            OooO0o oooO0o4 = new OooO0o("CHINESE_SIMPLIFIED", 3);
            OooO0o oooO0o5 = new OooO0o("CHINESE_TRADITIONAL", 4);
            OooO0o oooO0o6 = new OooO0o("CZECH", 5);
            OooO0o oooO0o7 = new OooO0o("DANISH", 6);
            OooO0o oooO0o8 = new OooO0o("DUTCH", 7);
            OooO0o oooO0o9 = new OooO0o("ENGLISH", 8);
            f68794OooOo0o = oooO0o9;
            f68793OooOo = new OooO0o[]{oooO0o, oooO0o2, oooO0o3, oooO0o4, oooO0o5, oooO0o6, oooO0o7, oooO0o8, oooO0o9, new OooO0o("FARSI", 9), new OooO0o("FRENCH", 10), new OooO0o("GERMAN", 11), new OooO0o("GREEK", 12), new OooO0o("GUJARATI", 13), new OooO0o("HEBREW", 14), new OooO0o("HINDI", 15), new OooO0o("INDONESIA", 16), new OooO0o("ITALIAN", 17), new OooO0o("JAPANESE", 18), new OooO0o("KAZAKH", 19), new OooO0o("KOREAN", 20), new OooO0o("MARATHI", 21), new OooO0o("POLISH", 22), new OooO0o("PORTUGUESE", 23), new OooO0o("PUNJABI", 24), new OooO0o("RUSSIAN", 25), new OooO0o("SLOVAK", 26), new OooO0o("SLOVENIAN", 27), new OooO0o("SPANISH", 28), new OooO0o("SWEDISH", 29), new OooO0o("TAGALOG", 30), new OooO0o("TURKISH", 31), new OooO0o("UKRAINIAN", 32), new OooO0o("URDU", 33), new OooO0o("UZBEK", 34), new OooO0o("VIETNAMESE", 35)};
        }

        public static OooO0o valueOf(String str) {
            return (OooO0o) Enum.valueOf(OooO0o.class, str);
        }

        public static OooO0o[] values() {
            return (OooO0o[]) f68793OooOo.clone();
        }
    }

    /* JADX INFO: renamed from: com.hbb20.CountryCodePicker$OooO0o0, reason: case insensitive filesystem */
    public interface InterfaceC22816OooO0o0 {
    }

    /* JADX INFO: renamed from: com.hbb20.CountryCodePicker$OooO0oO, reason: case insensitive filesystem */
    public interface InterfaceC22817OooO0oO {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.hbb20.CountryCodePicker$OooO0oo, reason: case insensitive filesystem */
    public static final class EnumC22818OooO0oo {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final /* synthetic */ EnumC22818OooO0oo[] f68795OooOo0o = {new EnumC22818OooO0oo("MOBILE", 0), new EnumC22818OooO0oo("FIXED_LINE", 1), new EnumC22818OooO0oo("FIXED_LINE_OR_MOBILE", 2), new EnumC22818OooO0oo("TOLL_FREE", 3), new EnumC22818OooO0oo("PREMIUM_RATE", 4), new EnumC22818OooO0oo("SHARED_COST", 5), new EnumC22818OooO0oo("VOIP", 6), new EnumC22818OooO0oo("PERSONAL_NUMBER", 7), new EnumC22818OooO0oo("PAGER", 8), new EnumC22818OooO0oo("UAN", 9), new EnumC22818OooO0oo("VOICEMAIL", 10), new EnumC22818OooO0oo(GrsBaseInfo.CountryCodeSource.UNKNOWN, 11)};

        /* JADX INFO: Fake field, exist only in values array */
        EnumC22818OooO0oo EF5;

        public EnumC22818OooO0oo() {
            throw null;
        }

        public static EnumC22818OooO0oo valueOf(String str) {
            return (EnumC22818OooO0oo) Enum.valueOf(EnumC22818OooO0oo.class, str);
        }

        public static EnumC22818OooO0oo[] values() {
            return (EnumC22818OooO0oo[]) f68795OooOo0o.clone();
        }
    }

    public enum OooOO0 {
        /* JADX INFO: Fake field, exist only in values array */
        LEFT(-1),
        /* JADX INFO: Fake field, exist only in values array */
        CENTER(0),
        /* JADX INFO: Fake field, exist only in values array */
        RIGHT(1);


        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f68797OooOo0o;

        OooOO0(int i) {
            this.f68797OooOo0o = i;
        }
    }

    private OooO0o getCCPLanguageFromLocale() {
        throw null;
    }

    private View.OnClickListener getCountryCodeHolderClickListener() {
        return null;
    }

    private TextWatcher getCountryDetectorTextWatcher() {
        if (this.f68747OooOoO != null && this.f68775Ooooo00 == null) {
            this.f68775Ooooo00 = new OooO00o();
        }
        return this.f68775Ooooo00;
    }

    private com.hbb20.OooO00o getDefaultCountry() {
        return this.f68752OooOooO;
    }

    private oO00OoO0.OooO getEnteredPhoneNumber() throws C32284OooO0Oo {
        EditText editText = this.f68747OooOoO;
        return getPhoneUtil().OooOo00(editText != null ? C32285OooO0o0.OooOOo(editText.getText().toString()) : "", getSelectedCountryNameCode());
    }

    private View getHolderView() {
        return this.f68745OooOo;
    }

    private C32285OooO0o0 getPhoneUtil() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.hbb20.OooO00o getSelectedCountry() {
        if (this.f68750OooOoo == null) {
            setSelectedCountry(getDefaultCountry());
        }
        return this.f68750OooOoo;
    }

    private C32285OooO0o0.OooO0O0 getSelectedHintNumberType() {
        int iOrdinal = this.f68763Oooo0oO.ordinal();
        C32285OooO0o0.OooO0O0 oooO0O0 = C32285OooO0o0.OooO0O0.f116093OooOo;
        switch (iOrdinal) {
            case 0:
                return oooO0O0;
            case 1:
                return C32285OooO0o0.OooO0O0.f116094OooOo0o;
            case 2:
                return C32285OooO0o0.OooO0O0.f116096OooOoO0;
            case 3:
                return C32285OooO0o0.OooO0O0.f116095OooOoO;
            case 4:
                return C32285OooO0o0.OooO0O0.f116097OooOoOO;
            case 5:
                return C32285OooO0o0.OooO0O0.f116099OooOoo0;
            case 6:
                return C32285OooO0o0.OooO0O0.f116098OooOoo;
            case 7:
                return C32285OooO0o0.OooO0O0.f116100OooOooO;
            case 8:
                return C32285OooO0o0.OooO0O0.f116101OooOooo;
            case 9:
                return C32285OooO0o0.OooO0O0.f116103Oooo000;
            case 10:
                return C32285OooO0o0.OooO0O0.f116104Oooo00O;
            case 11:
                return C32285OooO0o0.OooO0O0.f116105Oooo00o;
            default:
                return oooO0O0;
        }
    }

    private LayoutInflater getmInflater() {
        return null;
    }

    private void setCustomDefaultLanguage(OooO0o oooO0o) {
        this.f68784o000oOoO = oooO0o;
        boolean zIsInEditMode = isInEditMode();
        OooO0o oooO0o2 = OooO0o.f68794OooOo0o;
        if (zIsInEditMode) {
            OooO0o oooO0o3 = this.f68784o000oOoO;
            if (oooO0o3 != null) {
                this.f68770OoooOOO = oooO0o3;
            } else {
                this.f68770OoooOOO = oooO0o2;
            }
        } else if (getCustomDefaultLanguage() != null) {
            this.f68770OoooOOO = this.f68784o000oOoO;
        } else {
            this.f68770OoooOOO = oooO0o2;
        }
        setSelectedCountry(com.hbb20.OooO00o.OooO0OO(null, getLanguageToApply(), this.f68750OooOoo.f68804OooOo0o));
    }

    private void setDefaultCountry(com.hbb20.OooO00o oooO00o) {
        this.f68752OooOooO = oooO00o;
    }

    private void setHolder(RelativeLayout relativeLayout) {
        this.f68749OooOoOO = relativeLayout;
    }

    private void setHolderView(View view) {
        this.f68745OooOo = view;
    }

    public final boolean OooO0O0() {
        if (getEditText_registeredCarrierNumber() == null || getEditText_registeredCarrierNumber().getText().length() == 0) {
            if (getEditText_registeredCarrierNumber() == null) {
                Toast.makeText((Context) null, "No editText for Carrier number found.", 0).show();
            }
            return false;
        }
        return getPhoneUtil().OooOOO0(getPhoneUtil().OooOo00("+" + this.f68750OooOoo.f68803OooOo + getEditText_registeredCarrierNumber().getText().toString(), this.f68750OooOoo.f68804OooOo0o));
    }

    public final void OooO0OO() {
        EditText editText = this.f68747OooOoO;
        if (editText == null) {
            if (editText == null) {
                Log.v("CCP", "updateFormattingTextWatcher: EditText not registered null");
                return;
            } else {
                Log.v("CCP", "updateFormattingTextWatcher: selected country is null null");
                return;
            }
        }
        String strOooOOo = C32285OooO0o0.OooOOo(getEditText_registeredCarrierNumber().getText().toString());
        this.f68747OooOoO.removeTextChangedListener(this.f68774OoooOoo);
        TextWatcher textWatcher = this.f68775Ooooo00;
        if (textWatcher != null) {
            this.f68747OooOoO.removeTextChangedListener(textWatcher);
        }
        if (this.f68771OoooOOo) {
            String selectedCountryNameCode = getSelectedCountryNameCode();
            int selectedCountryCodeAsInt = getSelectedCountryCodeAsInt();
            boolean z = this.f68761Oooo0o;
            p618o0.OooO0O0 oooO0O0 = new p618o0.OooO0O0();
            oooO0O0.f80952OooOo0o = false;
            oooO0O0.f80953OooOoO = null;
            oooO0O0.f80957OooOoo0 = false;
            if (selectedCountryNameCode == null || selectedCountryNameCode.length() == 0) {
                throw new IllegalArgumentException();
            }
            C32285OooO0o0 c32285OooO0o0OooO0O0 = C32285OooO0o0.OooO0O0(null);
            oooO0O0.f80955OooOoOO = selectedCountryCodeAsInt;
            C32281OooO00o c32281OooO00o = new C32281OooO00o(c32285OooO0o0OooO0O0, selectedCountryNameCode);
            oooO0O0.f80954OooOoO0 = c32281OooO00o;
            c32281OooO00o.OooO0o();
            Editable editable = oooO0O0.f80953OooOoO;
            if (editable != null) {
                oooO0O0.f80957OooOoo0 = true;
                String strOooOOo2 = C32285OooO0o0.OooOOo(editable);
                Editable editable2 = oooO0O0.f80953OooOoO;
                editable2.replace(0, editable2.length(), strOooOOo2, 0, strOooOOo2.length());
                oooO0O0.f80957OooOoo0 = false;
            }
            oooO0O0.f80956OooOoo = z;
            this.f68774OoooOoo = oooO0O0;
            this.f68747OooOoO.addTextChangedListener(oooO0O0);
        }
        if (this.f68760Oooo0OO) {
            TextWatcher countryDetectorTextWatcher = getCountryDetectorTextWatcher();
            this.f68775Ooooo00 = countryDetectorTextWatcher;
            this.f68747OooOoO.addTextChangedListener(countryDetectorTextWatcher);
        }
        this.f68747OooOoO.setText("");
        this.f68747OooOoO.setText(strOooOOo);
        EditText editText2 = this.f68747OooOoO;
        editText2.setSelection(editText2.getText().length());
    }

    public final void OooO0Oo() {
        if (this.f68747OooOoO == null || !this.f68772OoooOo0) {
            return;
        }
        C32285OooO0o0 phoneUtil = getPhoneUtil();
        String selectedCountryNameCode = getSelectedCountryNameCode();
        C32285OooO0o0.OooO0O0 selectedHintNumberType = getSelectedHintNumberType();
        boolean zOooOOO = phoneUtil.OooOOO(selectedCountryNameCode);
        Logger logger = C32285OooO0o0.f116061OooO0oo;
        oO00OoO0.OooO oooOOooOo00 = null;
        if (zOooOOO) {
            C32287OooO0oo c32287OooO0ooOooO = C32285OooO0o0.OooO(phoneUtil.OooO0oO(selectedCountryNameCode), selectedHintNumberType);
            try {
                if (c32287OooO0ooOooO.f116170OooOoOO) {
                    oooOOooOo00 = phoneUtil.OooOo00(c32287OooO0ooOooO.f116171OooOoo0, selectedCountryNameCode);
                }
            } catch (C32284OooO0Oo e) {
                logger.log(Level.SEVERE, e.toString());
            }
        } else {
            logger.log(Level.WARNING, "Invalid or unknown region code provided: " + selectedCountryNameCode);
        }
        String number = "";
        if (oooOOooOo00 != null) {
            number = PhoneNumberUtils.formatNumber(getSelectedCountryCodeWithPlus() + android.support.v4.media.session.OooO00o.OooO00o(oooOOooOo00.f116005OooOo, "", new StringBuilder()), getSelectedCountryNameCode());
            if (number != null) {
                number = number.substring(getSelectedCountryCodeWithPlus().length()).trim();
            }
        }
        if (number == null) {
            number = this.f68756Oooo000;
        }
        this.f68747OooOoO.setHint(number);
    }

    public boolean getCcpDialogShowFlag() {
        return this.f68759Oooo0O0;
    }

    public boolean getCcpDialogShowNameCode() {
        return this.f68762Oooo0o0;
    }

    public boolean getCcpDialogShowTitle() {
        return this.f68755Oooo0;
    }

    public int getContentColor() {
        return this.f68764Oooo0oo;
    }

    public OooOO0 getCurrentTextGravity() {
        return this.f68753OooOooo;
    }

    public OooO0o getCustomDefaultLanguage() {
        return this.f68784o000oOoO;
    }

    public List<com.hbb20.OooO00o> getCustomMasterCountriesList() {
        return this.f68768OoooO0O;
    }

    public String getCustomMasterCountriesParam() {
        return this.f68765OoooO;
    }

    public String getDefaultCountryCode() {
        return this.f68752OooOooO.f68803OooOo;
    }

    public int getDefaultCountryCodeAsInt() {
        try {
            return Integer.parseInt(getDefaultCountryCode());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public String getDefaultCountryCodeWithPlus() {
        return "+" + getDefaultCountryCode();
    }

    public String getDefaultCountryName() {
        return getDefaultCountry().f68806OooOoO0;
    }

    public String getDefaultCountryNameCode() {
        return getDefaultCountry().f68804OooOo0o.toUpperCase();
    }

    public int getDialogBackgroundColor() {
        return this.f68782OoooooO;
    }

    public int getDialogBackgroundResId() {
        return this.f68780Oooooo;
    }

    public float getDialogCornerRadius() {
        return this.f68785o00O0O;
    }

    public InterfaceC22815OooO0Oo getDialogEventsListener() {
        return null;
    }

    public int getDialogSearchEditTextTintColor() {
        return this.f68787o0OoOo0;
    }

    public int getDialogTextColor() {
        return this.f68783Ooooooo;
    }

    public String getDialogTitle() {
        String str;
        OooO0o languageToApply = getLanguageToApply();
        OooO0o oooO0o = com.hbb20.OooO00o.f68799OooOoo0;
        if (oooO0o == null || oooO0o != languageToApply || (str = com.hbb20.OooO00o.f68798OooOoo) == null || str.length() == 0) {
            com.hbb20.OooO00o.OooO0o(null, languageToApply);
        }
        return com.hbb20.OooO00o.f68798OooOoo;
    }

    public Typeface getDialogTypeFace() {
        return this.f68767OoooO00;
    }

    public int getDialogTypeFaceStyle() {
        return -99;
    }

    public EditText getEditText_registeredCarrierNumber() {
        return this.f68747OooOoO;
    }

    public int getFastScrollerBubbleColor() {
        return this.f68766OoooO0;
    }

    public int getFastScrollerBubbleTextAppearance() {
        return this.f68788ooOO;
    }

    public int getFastScrollerHandleColor() {
        return this.f68781Oooooo0;
    }

    public String getFormattedFullNumber() {
        try {
            return "+" + getPhoneUtil().OooO0o0(getEnteredPhoneNumber(), C32285OooO0o0.OooO00o.f116088OooOo).substring(1);
        } catch (C32284OooO0Oo unused) {
            Log.e("CCP", "getFullNumber: Could not parse number");
            return getFullNumberWithPlus();
        }
    }

    public String getFullNumber() {
        try {
            return getPhoneUtil().OooO0o0(getEnteredPhoneNumber(), C32285OooO0o0.OooO00o.f116089OooOo0o).substring(1);
        } catch (C32284OooO0Oo unused) {
            Log.e("CCP", "getFullNumber: Could not parse number");
            return getSelectedCountryCode() + C32285OooO0o0.OooOOo(this.f68747OooOoO.getText().toString());
        }
    }

    public String getFullNumberWithPlus() {
        return "+" + getFullNumber();
    }

    public RelativeLayout getHolder() {
        return this.f68749OooOoOO;
    }

    public ImageView getImageViewFlag() {
        return this.f68751OooOoo0;
    }

    public OooO0o getLanguageToApply() {
        if (this.f68770OoooOOO == null) {
            boolean zIsInEditMode = isInEditMode();
            OooO0o oooO0o = OooO0o.f68794OooOo0o;
            if (zIsInEditMode) {
                OooO0o oooO0o2 = this.f68784o000oOoO;
                if (oooO0o2 != null) {
                    this.f68770OoooOOO = oooO0o2;
                } else {
                    this.f68770OoooOOO = oooO0o;
                }
            } else if (getCustomDefaultLanguage() != null) {
                this.f68770OoooOOO = this.f68784o000oOoO;
            } else {
                this.f68770OoooOOO = oooO0o;
            }
        }
        return this.f68770OoooOOO;
    }

    public String getNoResultACK() {
        String str;
        OooO0o languageToApply = getLanguageToApply();
        OooO0o oooO0o = com.hbb20.OooO00o.f68799OooOoo0;
        if (oooO0o == null || oooO0o != languageToApply || (str = com.hbb20.OooO00o.f68801OooOooo) == null || str.length() == 0) {
            com.hbb20.OooO00o.OooO0o(null, languageToApply);
        }
        return com.hbb20.OooO00o.f68801OooOooo;
    }

    public String getSearchHintText() {
        String str;
        OooO0o languageToApply = getLanguageToApply();
        OooO0o oooO0o = com.hbb20.OooO00o.f68799OooOoo0;
        if (oooO0o == null || oooO0o != languageToApply || (str = com.hbb20.OooO00o.f68800OooOooO) == null || str.length() == 0) {
            com.hbb20.OooO00o.OooO0o(null, languageToApply);
        }
        return com.hbb20.OooO00o.f68800OooOooO;
    }

    public String getSelectedCountryCode() {
        return getSelectedCountry().f68803OooOo;
    }

    public int getSelectedCountryCodeAsInt() {
        try {
            return Integer.parseInt(getSelectedCountryCode());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public String getSelectedCountryCodeWithPlus() {
        return "+" + getSelectedCountryCode();
    }

    public String getSelectedCountryEnglishName() {
        return getSelectedCountry().f68805OooOoO;
    }

    public int getSelectedCountryFlagResourceId() {
        return getSelectedCountry().f68807OooOoOO;
    }

    public String getSelectedCountryName() {
        return getSelectedCountry().f68806OooOoO0;
    }

    public String getSelectedCountryNameCode() {
        return getSelectedCountry().f68804OooOo0o.toUpperCase();
    }

    public TextView getTextView_selectedCountry() {
        return this.f68748OooOoO0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i = com.hbb20.OooO0OO.f68812OooO00o;
        super.onDetachedFromWindow();
    }

    public void setArrowColor(int i) {
        this.f68754Oooo = i;
        if (i != -99) {
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            throw null;
        }
        if (this.f68764Oooo0oo == -99) {
            return;
        }
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        throw null;
    }

    public void setArrowSize(int i) {
        if (i > 0) {
            throw null;
        }
    }

    public void setAutoDetectedCountry(boolean z) {
        for (int i = 0; i < this.f68757Oooo00O.f68792OooOo0o.length(); i++) {
            try {
                switch (this.f68757Oooo00O.f68792OooOo0o.charAt(i)) {
                    case '1':
                        try {
                            throw null;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case '2':
                        try {
                            throw null;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        break;
                    case '3':
                        try {
                            throw null;
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                        break;
                    default:
                        break;
                }
            } catch (Exception e4) {
                e4.printStackTrace();
                Log.w("CCP", "setAutoDetectCountry: Exception" + e4.getMessage());
                if (z) {
                    com.hbb20.OooO00o oooO00oOooO0OO = com.hbb20.OooO00o.OooO0OO(getContext(), getLanguageToApply(), getDefaultCountryNameCode());
                    this.f68752OooOooO = oooO00oOooO0OO;
                    setSelectedCountry(oooO00oOooO0OO);
                    return;
                }
                return;
            }
        }
        if (z) {
            com.hbb20.OooO00o oooO00oOooO0OO2 = com.hbb20.OooO00o.OooO0OO(getContext(), getLanguageToApply(), getDefaultCountryNameCode());
            this.f68752OooOooO = oooO00oOooO0OO2;
            setSelectedCountry(oooO00oOooO0OO2);
        }
    }

    public void setAutoDetectionFailureListener(InterfaceC22816OooO0o0 interfaceC22816OooO0o0) {
    }

    public void setCcpClickable(boolean z) {
        if (!z) {
            throw null;
        }
        throw null;
    }

    public void setCcpDialogShowFlag(boolean z) {
        this.f68759Oooo0O0 = z;
    }

    public void setCcpDialogShowNameCode(boolean z) {
        this.f68762Oooo0o0 = z;
    }

    public void setCcpDialogShowPhoneCode(boolean z) {
    }

    public void setCcpDialogShowTitle(boolean z) {
        this.f68755Oooo0 = z;
    }

    public void setContentColor(int i) {
        this.f68764Oooo0oo = i;
        this.f68748OooOoO0.setTextColor(i);
        if (this.f68754Oooo != -99) {
            return;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        throw null;
    }

    public void setCountryAutoDetectionPref(OooO0O0 oooO0O0) {
        this.f68757Oooo00O = oooO0O0;
    }

    public void setCountryForNameCode(String str) {
        com.hbb20.OooO00o oooO00oOooO0OO = com.hbb20.OooO00o.OooO0OO(getContext(), getLanguageToApply(), str);
        if (oooO00oOooO0OO != null) {
            setSelectedCountry(oooO00oOooO0OO);
            return;
        }
        if (this.f68752OooOooO == null) {
            this.f68752OooOooO = com.hbb20.OooO00o.OooO00o(getContext(), getLanguageToApply(), this.f68746OooOo0o);
        }
        setSelectedCountry(this.f68752OooOooO);
    }

    public void setCountryForPhoneCode(int i) {
        com.hbb20.OooO00o OooO00o2 = com.hbb20.OooO00o.OooO00o(getContext(), getLanguageToApply(), i);
        if (OooO00o2 != null) {
            setSelectedCountry(OooO00o2);
            return;
        }
        if (this.f68752OooOooO == null) {
            this.f68752OooOooO = com.hbb20.OooO00o.OooO00o(getContext(), getLanguageToApply(), this.f68746OooOo0o);
        }
        setSelectedCountry(this.f68752OooOooO);
    }

    public void setCountryPreference(String str) {
    }

    public void setCurrentTextGravity(OooOO0 oooOO02) {
        this.f68753OooOooo = oooOO02;
        int i = oooOO02.f68797OooOo0o;
        if (i == -1) {
            this.f68748OooOoO0.setGravity(3);
        } else if (i == 0) {
            this.f68748OooOoO0.setGravity(17);
        } else {
            this.f68748OooOoO0.setGravity(5);
        }
    }

    public void setCustomDialogTextProvider(OooO0OO oooO0OO) {
    }

    public void setCustomMasterCountries(String str) {
        this.f68765OoooO = str;
    }

    public void setCustomMasterCountriesList(List<com.hbb20.OooO00o> list) {
        this.f68768OoooO0O = list;
    }

    public void setDefaultCountryUsingNameCode(String str) {
        com.hbb20.OooO00o oooO00oOooO0OO = com.hbb20.OooO00o.OooO0OO(getContext(), getLanguageToApply(), str);
        if (oooO00oOooO0OO == null) {
            return;
        }
        setDefaultCountry(oooO00oOooO0OO);
    }

    @Deprecated
    public void setDefaultCountryUsingPhoneCode(int i) {
        com.hbb20.OooO00o OooO00o2 = com.hbb20.OooO00o.OooO00o(getContext(), getLanguageToApply(), i);
        if (OooO00o2 == null) {
            return;
        }
        this.f68746OooOo0o = i;
        setDefaultCountry(OooO00o2);
    }

    public void setDetectCountryWithAreaCode(boolean z) {
        this.f68760Oooo0OO = z;
        OooO0OO();
    }

    public void setDialogBackground(int i) {
        this.f68780Oooooo = i;
    }

    public void setDialogBackgroundColor(int i) {
        this.f68782OoooooO = i;
    }

    public void setDialogCornerRaius(float f) {
        this.f68785o00O0O = f;
    }

    public void setDialogEventsListener(InterfaceC22815OooO0Oo interfaceC22815OooO0Oo) {
    }

    public void setDialogKeyboardAutoPopup(boolean z) {
    }

    public void setDialogSearchEditTextTintColor(int i) {
        this.f68787o0OoOo0 = i;
    }

    public void setDialogTextColor(int i) {
        this.f68783Ooooooo = i;
    }

    public void setDialogTypeFace(Typeface typeface) {
        try {
            this.f68767OoooO00 = typeface;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setEditText_registeredCarrierNumber(EditText editText) {
        this.f68747OooOoO = editText;
        if (editText.getHint() != null) {
            this.f68756Oooo000 = this.f68747OooOoO.getHint().toString();
        }
        try {
            this.f68747OooOoO.removeTextChangedListener(this.f68773OoooOoO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        OooO0O0();
        C22819OooO0Oo c22819OooO0Oo = new C22819OooO0Oo(this);
        this.f68773OoooOoO = c22819OooO0Oo;
        this.f68747OooOoO.addTextChangedListener(c22819OooO0Oo);
        OooO0OO();
        OooO0Oo();
    }

    public void setExcludedCountries(String str) {
        this.f68769OoooOO0 = str;
        String str2 = this.f68765OoooO;
        if (str2 == null || str2.length() == 0) {
            String str3 = this.f68769OoooOO0;
            if (str3 == null || str3.length() == 0) {
                this.f68768OoooO0O = null;
            } else {
                this.f68769OoooOO0 = this.f68769OoooOO0.toLowerCase();
                ArrayList<com.hbb20.OooO00o> arrayListOooO0o0 = com.hbb20.OooO00o.OooO0o0(null, getLanguageToApply());
                ArrayList arrayList = new ArrayList();
                for (com.hbb20.OooO00o oooO00o : arrayListOooO0o0) {
                    if (!this.f68769OoooOO0.contains(oooO00o.f68804OooOo0o.toLowerCase())) {
                        arrayList.add(oooO00o);
                    }
                }
                if (arrayList.size() > 0) {
                    this.f68768OoooO0O = arrayList;
                } else {
                    this.f68768OoooO0O = null;
                }
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (String str4 : this.f68765OoooO.split(",")) {
                com.hbb20.OooO00o oooO00oOooO0OO = com.hbb20.OooO00o.OooO0OO(getContext(), getLanguageToApply(), str4);
                if (oooO00oOooO0OO != null) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((com.hbb20.OooO00o) it.next()).f68804OooOo0o.equalsIgnoreCase(oooO00oOooO0OO.f68804OooOo0o)) {
                                break;
                            }
                        } else {
                            arrayList2.add(oooO00oOooO0OO);
                            break;
                        }
                    }
                }
            }
            if (arrayList2.size() == 0) {
                this.f68768OoooO0O = null;
            } else {
                this.f68768OoooO0O = arrayList2;
            }
        }
        List<com.hbb20.OooO00o> list = this.f68768OoooO0O;
        if (list != null) {
            for (com.hbb20.OooO00o oooO00o2 : list) {
                oooO00o2.getClass();
                try {
                    Log.d("Class Country", "Country->" + oooO00o2.f68804OooOo0o + C18241k5.f55433h + oooO00o2.f68803OooOo + C18241k5.f55433h + oooO00o2.f68806OooOoO0);
                } catch (NullPointerException unused) {
                    Log.d("Class Country", "Null");
                }
            }
        }
    }

    public void setFastScrollerBubbleColor(int i) {
        this.f68766OoooO0 = i;
    }

    public void setFastScrollerBubbleTextAppearance(int i) {
        this.f68788ooOO = i;
    }

    public void setFastScrollerHandleColor(int i) {
        this.f68781Oooooo0 = i;
    }

    public void setFlagBorderColor(int i) {
        throw null;
    }

    public void setFlagSize(int i) {
        this.f68751OooOoo0.getLayoutParams().height = i;
        this.f68751OooOoo0.requestLayout();
    }

    public void setFullNumber(String str) {
        int iIndexOf;
        com.hbb20.OooO0O0 OooO0O02;
        Context context = getContext();
        OooO0o languageToApply = getLanguageToApply();
        com.hbb20.OooO00o defaultCountry = null;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.length() != 0) {
                int i = strTrim.charAt(0) == '+' ? 1 : 0;
                int i2 = i;
                while (true) {
                    if (i2 > strTrim.length()) {
                        break;
                    }
                    String strSubstring = strTrim.substring(i, i2);
                    try {
                        OooO0O02 = com.hbb20.OooO0O0.OooO0O0(Integer.parseInt(strSubstring));
                    } catch (Exception unused) {
                        OooO0O02 = null;
                    }
                    if (OooO0O02 != null) {
                        int length = strSubstring.length() + i;
                        int length2 = strTrim.length();
                        int i3 = OooO0O02.f68810OooO0O0 + length;
                        defaultCountry = length2 >= i3 ? OooO0O02.OooO00o(context, languageToApply, strTrim.substring(length, i3)) : com.hbb20.OooO00o.OooO0OO(context, languageToApply, OooO0O02.f68809OooO00o);
                    } else {
                        com.hbb20.OooO00o oooO00oOooO0O0 = com.hbb20.OooO00o.OooO0O0(context, languageToApply, strSubstring);
                        if (oooO00oOooO0O0 != null) {
                            defaultCountry = oooO00oOooO0O0;
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        if (defaultCountry == null) {
            defaultCountry = getDefaultCountry();
        }
        setSelectedCountry(defaultCountry);
        if (defaultCountry != null && str != null && !str.isEmpty() && (iIndexOf = str.indexOf(defaultCountry.f68803OooOo)) != -1) {
            str = str.substring(defaultCountry.f68803OooOo.length() + iIndexOf);
        }
        if (getEditText_registeredCarrierNumber() == null) {
            Log.w("CCP", "EditText for carrier number is not registered. Register it using registerCarrierNumberEditText() before getFullNumber() or setFullNumber().");
        } else {
            getEditText_registeredCarrierNumber().setText(str);
            OooO0OO();
        }
    }

    public void setHintExampleNumberEnabled(boolean z) {
        this.f68772OoooOo0 = z;
        OooO0Oo();
    }

    public void setHintExampleNumberType(EnumC22818OooO0oo enumC22818OooO0oo) {
        this.f68763Oooo0oO = enumC22818OooO0oo;
        OooO0Oo();
    }

    public void setImageViewFlag(ImageView imageView) {
        this.f68751OooOoo0 = imageView;
    }

    public void setInternationalFormattingOnly(boolean z) {
        this.f68761Oooo0o = z;
        if (this.f68747OooOoO != null) {
            OooO0OO();
        }
    }

    public void setLanguageToApply(OooO0o oooO0o) {
        this.f68770OoooOOO = oooO0o;
    }

    public void setNumberAutoFormattingEnabled(boolean z) {
        this.f68771OoooOOo = z;
        if (this.f68747OooOoO != null) {
            OooO0OO();
        }
    }

    public void setOnCountryChangeListener(InterfaceC22817OooO0oO interfaceC22817OooO0oO) {
    }

    public void setPhoneNumberValidityChangeListener(OooO oooO) {
        if (this.f68747OooOoO == null || oooO == null) {
            return;
        }
        OooO0O0();
        oooO.OooO00o();
    }

    public void setSearchAllowed(boolean z) {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void setSelectedCountry(com.hbb20.OooO00o oooO00o) {
        this.f68776Ooooo0o = false;
        String string = "";
        this.f68777OooooO0 = "";
        if (oooO00o == null && (oooO00o = com.hbb20.OooO00o.OooO00o(getContext(), getLanguageToApply(), this.f68746OooOo0o)) == null) {
            return;
        }
        this.f68750OooOoo = oooO00o;
        if (this.f68758Oooo00o) {
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO("", "+");
            sbOooO0OO.append(oooO00o.f68803OooOo);
            string = sbOooO0OO.toString();
        }
        this.f68748OooOoO0.setText(string);
        if (string.length() == 0) {
            StringBuilder sbOooO0OO2 = C22226Oooo0oo.OooO0OO(string, "+");
            sbOooO0OO2.append(oooO00o.f68803OooOo);
            this.f68748OooOoO0.setText(sbOooO0OO2.toString());
        }
        ImageView imageView = this.f68751OooOoo0;
        if (oooO00o.f68807OooOoOO == -99) {
            String lowerCase = oooO00o.f68804OooOo0o.toLowerCase();
            lowerCase.getClass();
            int i = R.drawable.flag_martinique;
            byte b = -1;
            switch (lowerCase.hashCode()) {
                case 3107:
                    if (lowerCase.equals("ad")) {
                        b = 0;
                    }
                    break;
                case 3108:
                    if (lowerCase.equals("ae")) {
                        b = 1;
                    }
                    break;
                case 3109:
                    if (lowerCase.equals(TranslateLanguage.AFRIKAANS)) {
                        b = 2;
                    }
                    break;
                case 3110:
                    if (lowerCase.equals("ag")) {
                        b = 3;
                    }
                    break;
                case 3112:
                    if (lowerCase.equals("ai")) {
                        b = 4;
                    }
                    break;
                case 3115:
                    if (lowerCase.equals("al")) {
                        b = 5;
                    }
                    break;
                case 3116:
                    if (lowerCase.equals("am")) {
                        b = 6;
                    }
                    break;
                case 3118:
                    if (lowerCase.equals("ao")) {
                        b = 7;
                    }
                    break;
                case 3120:
                    if (lowerCase.equals("aq")) {
                        b = 8;
                    }
                    break;
                case 3121:
                    if (lowerCase.equals(TranslateLanguage.ARABIC)) {
                        b = 9;
                    }
                    break;
                case 3122:
                    if (lowerCase.equals("as")) {
                        b = 10;
                    }
                    break;
                case 3123:
                    if (lowerCase.equals("at")) {
                        b = 11;
                    }
                    break;
                case 3124:
                    if (lowerCase.equals("au")) {
                        b = 12;
                    }
                    break;
                case 3126:
                    if (lowerCase.equals("aw")) {
                        b = 13;
                    }
                    break;
                case 3127:
                    if (lowerCase.equals("ax")) {
                        b = 14;
                    }
                    break;
                case 3129:
                    if (lowerCase.equals("az")) {
                        b = 15;
                    }
                    break;
                case 3135:
                    if (lowerCase.equals("ba")) {
                        b = 16;
                    }
                    break;
                case 3136:
                    if (lowerCase.equals("bb")) {
                        b = 17;
                    }
                    break;
                case 3138:
                    if (lowerCase.equals("bd")) {
                        b = 18;
                    }
                    break;
                case 3139:
                    if (lowerCase.equals(TranslateLanguage.BELARUSIAN)) {
                        b = 19;
                    }
                    break;
                case 3140:
                    if (lowerCase.equals("bf")) {
                        b = 20;
                    }
                    break;
                case 3141:
                    if (lowerCase.equals(TranslateLanguage.BULGARIAN)) {
                        b = 21;
                    }
                    break;
                case 3142:
                    if (lowerCase.equals("bh")) {
                        b = 22;
                    }
                    break;
                case 3143:
                    if (lowerCase.equals("bi")) {
                        b = 23;
                    }
                    break;
                case 3144:
                    if (lowerCase.equals("bj")) {
                        b = 24;
                    }
                    break;
                case 3146:
                    if (lowerCase.equals("bl")) {
                        b = 25;
                    }
                    break;
                case 3147:
                    if (lowerCase.equals("bm")) {
                        b = 26;
                    }
                    break;
                case 3148:
                    if (lowerCase.equals(TranslateLanguage.BENGALI)) {
                        b = 27;
                    }
                    break;
                case 3149:
                    if (lowerCase.equals("bo")) {
                        b = 28;
                    }
                    break;
                case 3152:
                    if (lowerCase.equals("br")) {
                        b = 29;
                    }
                    break;
                case 3153:
                    if (lowerCase.equals("bs")) {
                        b = 30;
                    }
                    break;
                case 3154:
                    if (lowerCase.equals("bt")) {
                        b = 31;
                    }
                    break;
                case 3157:
                    if (lowerCase.equals("bw")) {
                        b = 32;
                    }
                    break;
                case 3159:
                    if (lowerCase.equals("by")) {
                        b = 33;
                    }
                    break;
                case 3160:
                    if (lowerCase.equals("bz")) {
                        b = 34;
                    }
                    break;
                case 3166:
                    if (lowerCase.equals(TranslateLanguage.CATALAN)) {
                        b = 35;
                    }
                    break;
                case 3168:
                    if (lowerCase.equals("cc")) {
                        b = 36;
                    }
                    break;
                case 3169:
                    if (lowerCase.equals("cd")) {
                        b = 37;
                    }
                    break;
                case 3171:
                    if (lowerCase.equals("cf")) {
                        b = 38;
                    }
                    break;
                case 3172:
                    if (lowerCase.equals("cg")) {
                        b = 39;
                    }
                    break;
                case 3173:
                    if (lowerCase.equals("ch")) {
                        b = 40;
                    }
                    break;
                case 3174:
                    if (lowerCase.equals("ci")) {
                        b = 41;
                    }
                    break;
                case 3176:
                    if (lowerCase.equals("ck")) {
                        b = PatternStyle.Plaid;
                    }
                    break;
                case 3177:
                    if (lowerCase.equals("cl")) {
                        b = PatternStyle.Sphere;
                    }
                    break;
                case 3178:
                    if (lowerCase.equals("cm")) {
                        b = PatternStyle.Weave;
                    }
                    break;
                case EditingLanguage.QUECHUA_PERU /* 3179 */:
                    if (lowerCase.equals("cn")) {
                        b = PatternStyle.DottedGrid;
                    }
                    break;
                case 3180:
                    if (lowerCase.equals("co")) {
                        b = PatternStyle.Divot;
                    }
                    break;
                case 3183:
                    if (lowerCase.equals("cr")) {
                        b = PatternStyle.Shingle;
                    }
                    break;
                case 3186:
                    if (lowerCase.equals("cu")) {
                        b = PatternStyle.Wave;
                    }
                    break;
                case 3187:
                    if (lowerCase.equals("cv")) {
                        b = PatternStyle.Horizontal;
                    }
                    break;
                case 3188:
                    if (lowerCase.equals("cw")) {
                        b = PatternStyle.Vertical;
                    }
                    break;
                case 3189:
                    if (lowerCase.equals("cx")) {
                        b = PatternStyle.Cross;
                    }
                    break;
                case 3190:
                    if (lowerCase.equals(TranslateLanguage.WELSH)) {
                        b = PatternStyle.DownwardDiagonal;
                    }
                    break;
                case 3191:
                    if (lowerCase.equals("cz")) {
                        b = PatternStyle.UpwardDiagonal;
                    }
                    break;
                case 3201:
                    if (lowerCase.equals(TranslateLanguage.GERMAN)) {
                        b = PatternStyle.DiagonalCross;
                    }
                    break;
                case 3206:
                    if (lowerCase.equals("dj")) {
                        b = 55;
                    }
                    break;
                case 3207:
                    if (lowerCase.equals("dk")) {
                        b = 56;
                    }
                    break;
                case 3209:
                    if (lowerCase.equals("dm")) {
                        b = 57;
                    }
                    break;
                case 3211:
                    if (lowerCase.equals("do")) {
                        b = 58;
                    }
                    break;
                case 3222:
                    if (lowerCase.equals("dz")) {
                        b = 59;
                    }
                    break;
                case 3230:
                    if (lowerCase.equals("ec")) {
                        b = 60;
                    }
                    break;
                case 3232:
                    if (lowerCase.equals("ee")) {
                        b = 61;
                    }
                    break;
                case 3234:
                    if (lowerCase.equals("eg")) {
                        b = 62;
                    }
                    break;
                case 3245:
                    if (lowerCase.equals("er")) {
                        b = 63;
                    }
                    break;
                case 3246:
                    if (lowerCase.equals(TranslateLanguage.SPANISH)) {
                        b = SignedBytes.MAX_POWER_OF_TWO;
                    }
                    break;
                case 3247:
                    if (lowerCase.equals(TranslateLanguage.ESTONIAN)) {
                        b = 65;
                    }
                    break;
                case 3267:
                    if (lowerCase.equals(TranslateLanguage.FINNISH)) {
                        b = 66;
                    }
                    break;
                case 3268:
                    if (lowerCase.equals("fj")) {
                        b = 67;
                    }
                    break;
                case 3269:
                    if (lowerCase.equals("fk")) {
                        b = 68;
                    }
                    break;
                case 3271:
                    if (lowerCase.equals("fm")) {
                        b = 69;
                    }
                    break;
                case 3273:
                    if (lowerCase.equals("fo")) {
                        b = 70;
                    }
                    break;
                case 3276:
                    if (lowerCase.equals(TranslateLanguage.FRENCH)) {
                        b = 71;
                    }
                    break;
                case 3290:
                    if (lowerCase.equals(TranslateLanguage.IRISH)) {
                        b = 72;
                    }
                    break;
                case 3291:
                    if (lowerCase.equals("gb")) {
                        b = 73;
                    }
                    break;
                case 3293:
                    if (lowerCase.equals("gd")) {
                        b = 74;
                    }
                    break;
                case 3294:
                    if (lowerCase.equals("ge")) {
                        b = 75;
                    }
                    break;
                case 3295:
                    if (lowerCase.equals("gf")) {
                        b = 76;
                    }
                    break;
                case 3296:
                    if (lowerCase.equals("gg")) {
                        b = 77;
                    }
                    break;
                case 3297:
                    if (lowerCase.equals("gh")) {
                        b = 78;
                    }
                    break;
                case 3298:
                    if (lowerCase.equals("gi")) {
                        b = 79;
                    }
                    break;
                case 3301:
                    if (lowerCase.equals(TranslateLanguage.GALICIAN)) {
                        b = 80;
                    }
                    break;
                case 3302:
                    if (lowerCase.equals("gm")) {
                        b = 81;
                    }
                    break;
                case 3303:
                    if (lowerCase.equals("gn")) {
                        b = 82;
                    }
                    break;
                case 3305:
                    if (lowerCase.equals("gp")) {
                        b = 83;
                    }
                    break;
                case 3306:
                    if (lowerCase.equals("gq")) {
                        b = 84;
                    }
                    break;
                case 3307:
                    if (lowerCase.equals("gr")) {
                        b = 85;
                    }
                    break;
                case 3309:
                    if (lowerCase.equals("gt")) {
                        b = 86;
                    }
                    break;
                case 3310:
                    if (lowerCase.equals(TranslateLanguage.GUJARATI)) {
                        b = 87;
                    }
                    break;
                case 3312:
                    if (lowerCase.equals("gw")) {
                        b = 88;
                    }
                    break;
                case 3314:
                    if (lowerCase.equals("gy")) {
                        b = 89;
                    }
                    break;
                case 3331:
                    if (lowerCase.equals("hk")) {
                        b = 90;
                    }
                    break;
                case 3334:
                    if (lowerCase.equals("hn")) {
                        b = 91;
                    }
                    break;
                case 3338:
                    if (lowerCase.equals(TranslateLanguage.CROATIAN)) {
                        b = 92;
                    }
                    break;
                case 3340:
                    if (lowerCase.equals(TranslateLanguage.HAITIAN_CREOLE)) {
                        b = 93;
                    }
                    break;
                case 3341:
                    if (lowerCase.equals(TranslateLanguage.HUNGARIAN)) {
                        b = 94;
                    }
                    break;
                case 3355:
                    if (lowerCase.equals("id")) {
                        b = 95;
                    }
                    break;
                case 3356:
                    if (lowerCase.equals("ie")) {
                        b = 96;
                    }
                    break;
                case 3363:
                    if (lowerCase.equals("il")) {
                        b = 97;
                    }
                    break;
                case 3364:
                    if (lowerCase.equals("im")) {
                        b = 98;
                    }
                    break;
                case 3365:
                    if (lowerCase.equals(BackupFile.EXTENSION_NOTEIN_FILE)) {
                        b = 99;
                    }
                    break;
                case 3366:
                    if (lowerCase.equals("io")) {
                        b = 100;
                    }
                    break;
                case 3368:
                    if (lowerCase.equals("iq")) {
                        b = 101;
                    }
                    break;
                case 3369:
                    if (lowerCase.equals("ir")) {
                        b = 102;
                    }
                    break;
                case 3370:
                    if (lowerCase.equals(TranslateLanguage.ICELANDIC)) {
                        b = 103;
                    }
                    break;
                case 3371:
                    if (lowerCase.equals(TranslateLanguage.ITALIAN)) {
                        b = 104;
                    }
                    break;
                case 3387:
                    if (lowerCase.equals("je")) {
                        b = 105;
                    }
                    break;
                case 3395:
                    if (lowerCase.equals("jm")) {
                        b = 106;
                    }
                    break;
                case 3397:
                    if (lowerCase.equals("jo")) {
                        b = 107;
                    }
                    break;
                case 3398:
                    if (lowerCase.equals("jp")) {
                        b = 108;
                    }
                    break;
                case 3418:
                    if (lowerCase.equals("ke")) {
                        b = 109;
                    }
                    break;
                case 3420:
                    if (lowerCase.equals("kg")) {
                        b = 110;
                    }
                    break;
                case 3421:
                    if (lowerCase.equals("kh")) {
                        b = 111;
                    }
                    break;
                case 3422:
                    if (lowerCase.equals("ki")) {
                        b = 112;
                    }
                    break;
                case 3426:
                    if (lowerCase.equals("km")) {
                        b = 113;
                    }
                    break;
                case 3427:
                    if (lowerCase.equals(TranslateLanguage.KANNADA)) {
                        b = 114;
                    }
                    break;
                case 3429:
                    if (lowerCase.equals("kp")) {
                        b = 115;
                    }
                    break;
                case 3431:
                    if (lowerCase.equals("kr")) {
                        b = 116;
                    }
                    break;
                case 3436:
                    if (lowerCase.equals("kw")) {
                        b = 117;
                    }
                    break;
                case 3438:
                    if (lowerCase.equals("ky")) {
                        b = 118;
                    }
                    break;
                case 3439:
                    if (lowerCase.equals("kz")) {
                        b = 119;
                    }
                    break;
                case 3445:
                    if (lowerCase.equals(NoteMeta.PROPERTY_LOCK_ADDED)) {
                        b = 120;
                    }
                    break;
                case 3446:
                    if (lowerCase.equals("lb")) {
                        b = 121;
                    }
                    break;
                case 3447:
                    if (lowerCase.equals("lc")) {
                        b = 122;
                    }
                    break;
                case 3453:
                    if (lowerCase.equals("li")) {
                        b = 123;
                    }
                    break;
                case 3455:
                    if (lowerCase.equals("lk")) {
                        b = 124;
                    }
                    break;
                case 3462:
                    if (lowerCase.equals("lr")) {
                        b = 125;
                    }
                    break;
                case 3463:
                    if (lowerCase.equals("ls")) {
                        b = 126;
                    }
                    break;
                case 3464:
                    if (lowerCase.equals(TranslateLanguage.LITHUANIAN)) {
                        b = Ascii.DEL;
                    }
                    break;
                case 3465:
                    if (lowerCase.equals("lu")) {
                        b = UnsignedBytes.MAX_POWER_OF_TWO;
                    }
                    break;
                case 3466:
                    if (lowerCase.equals(TranslateLanguage.LATVIAN)) {
                        b = 129;
                    }
                    break;
                case 3469:
                    if (lowerCase.equals("ly")) {
                        b = 130;
                    }
                    break;
                case 3476:
                    if (lowerCase.equals("ma")) {
                        b = 131;
                    }
                    break;
                case 3478:
                    if (lowerCase.equals("mc")) {
                        b = 132;
                    }
                    break;
                case 3479:
                    if (lowerCase.equals("md")) {
                        b = 133;
                    }
                    break;
                case 3480:
                    if (lowerCase.equals("me")) {
                        b = 134;
                    }
                    break;
                case 3481:
                    if (lowerCase.equals("mf")) {
                        b = 135;
                    }
                    break;
                case 3482:
                    if (lowerCase.equals("mg")) {
                        b = 136;
                    }
                    break;
                case 3483:
                    if (lowerCase.equals("mh")) {
                        b = 137;
                    }
                    break;
                case 3486:
                    if (lowerCase.equals(TranslateLanguage.MACEDONIAN)) {
                        b = 138;
                    }
                    break;
                case 3487:
                    if (lowerCase.equals("ml")) {
                        b = 139;
                    }
                    break;
                case 3488:
                    if (lowerCase.equals("mm")) {
                        b = 140;
                    }
                    break;
                case 3489:
                    if (lowerCase.equals("mn")) {
                        b = 141;
                    }
                    break;
                case 3490:
                    if (lowerCase.equals("mo")) {
                        b = 142;
                    }
                    break;
                case 3491:
                    if (lowerCase.equals("mp")) {
                        b = 143;
                    }
                    break;
                case 3492:
                    if (lowerCase.equals("mq")) {
                        b = 144;
                    }
                    break;
                case 3493:
                    if (lowerCase.equals(TranslateLanguage.MARATHI)) {
                        b = 145;
                    }
                    break;
                case 3494:
                    if (lowerCase.equals(TranslateLanguage.MALAY)) {
                        b = 146;
                    }
                    break;
                case 3495:
                    if (lowerCase.equals(TranslateLanguage.MALTESE)) {
                        b = 147;
                    }
                    break;
                case 3496:
                    if (lowerCase.equals("mu")) {
                        b = 148;
                    }
                    break;
                case 3497:
                    if (lowerCase.equals("mv")) {
                        b = 149;
                    }
                    break;
                case 3498:
                    if (lowerCase.equals("mw")) {
                        b = 150;
                    }
                    break;
                case 3499:
                    if (lowerCase.equals("mx")) {
                        b = 151;
                    }
                    break;
                case 3500:
                    if (lowerCase.equals("my")) {
                        b = 152;
                    }
                    break;
                case 3501:
                    if (lowerCase.equals("mz")) {
                        b = 153;
                    }
                    break;
                case 3507:
                    if (lowerCase.equals("na")) {
                        b = 154;
                    }
                    break;
                case 3509:
                    if (lowerCase.equals("nc")) {
                        b = 155;
                    }
                    break;
                case 3511:
                    if (lowerCase.equals("ne")) {
                        b = 156;
                    }
                    break;
                case 3512:
                    if (lowerCase.equals("nf")) {
                        b = 157;
                    }
                    break;
                case 3513:
                    if (lowerCase.equals("ng")) {
                        b = 158;
                    }
                    break;
                case 3515:
                    if (lowerCase.equals("ni")) {
                        b = 159;
                    }
                    break;
                case 3518:
                    if (lowerCase.equals(TranslateLanguage.DUTCH)) {
                        b = 160;
                    }
                    break;
                case 3521:
                    if (lowerCase.equals(TranslateLanguage.NORWEGIAN)) {
                        b = 161;
                    }
                    break;
                case 3522:
                    if (lowerCase.equals("np")) {
                        b = 162;
                    }
                    break;
                case 3524:
                    if (lowerCase.equals("nr")) {
                        b = 163;
                    }
                    break;
                case 3527:
                    if (lowerCase.equals("nu")) {
                        b = 164;
                    }
                    break;
                case 3532:
                    if (lowerCase.equals("nz")) {
                        b = 165;
                    }
                    break;
                case 3550:
                    if (lowerCase.equals("om")) {
                        b = 166;
                    }
                    break;
                case 3569:
                    if (lowerCase.equals("pa")) {
                        b = 167;
                    }
                    break;
                case 3573:
                    if (lowerCase.equals("pe")) {
                        b = 168;
                    }
                    break;
                case 3574:
                    if (lowerCase.equals("pf")) {
                        b = 169;
                    }
                    break;
                case 3575:
                    if (lowerCase.equals("pg")) {
                        b = 170;
                    }
                    break;
                case 3576:
                    if (lowerCase.equals("ph")) {
                        b = 171;
                    }
                    break;
                case 3579:
                    if (lowerCase.equals("pk")) {
                        b = 172;
                    }
                    break;
                case 3580:
                    if (lowerCase.equals(TranslateLanguage.POLISH)) {
                        b = 173;
                    }
                    break;
                case 3581:
                    if (lowerCase.equals("pm")) {
                        b = 174;
                    }
                    break;
                case 3582:
                    if (lowerCase.equals("pn")) {
                        b = 175;
                    }
                    break;
                case 3586:
                    if (lowerCase.equals("pr")) {
                        b = 176;
                    }
                    break;
                case 3587:
                    if (lowerCase.equals("ps")) {
                        b = 177;
                    }
                    break;
                case 3588:
                    if (lowerCase.equals(TranslateLanguage.PORTUGUESE)) {
                        b = 178;
                    }
                    break;
                case 3591:
                    if (lowerCase.equals("pw")) {
                        b = 179;
                    }
                    break;
                case 3593:
                    if (lowerCase.equals("py")) {
                        b = 180;
                    }
                    break;
                case 3600:
                    if (lowerCase.equals("qa")) {
                        b = 181;
                    }
                    break;
                case 3635:
                    if (lowerCase.equals("re")) {
                        b = 182;
                    }
                    break;
                case 3645:
                    if (lowerCase.equals(TranslateLanguage.ROMANIAN)) {
                        b = 183;
                    }
                    break;
                case 3649:
                    if (lowerCase.equals("rs")) {
                        b = 184;
                    }
                    break;
                case 3651:
                    if (lowerCase.equals(TranslateLanguage.RUSSIAN)) {
                        b = 185;
                    }
                    break;
                case 3653:
                    if (lowerCase.equals("rw")) {
                        b = 186;
                    }
                    break;
                case 3662:
                    if (lowerCase.equals("sa")) {
                        b = 187;
                    }
                    break;
                case 3663:
                    if (lowerCase.equals("sb")) {
                        b = 188;
                    }
                    break;
                case 3664:
                    if (lowerCase.equals("sc")) {
                        b = 189;
                    }
                    break;
                case 3665:
                    if (lowerCase.equals("sd")) {
                        b = 190;
                    }
                    break;
                case 3666:
                    if (lowerCase.equals("se")) {
                        b = 191;
                    }
                    break;
                case 3668:
                    if (lowerCase.equals("sg")) {
                        b = 192;
                    }
                    break;
                case 3669:
                    if (lowerCase.equals("sh")) {
                        b = 193;
                    }
                    break;
                case 3670:
                    if (lowerCase.equals("si")) {
                        b = 194;
                    }
                    break;
                case 3672:
                    if (lowerCase.equals(TranslateLanguage.SLOVAK)) {
                        b = 195;
                    }
                    break;
                case 3673:
                    if (lowerCase.equals(TranslateLanguage.SLOVENIAN)) {
                        b = 196;
                    }
                    break;
                case 3674:
                    if (lowerCase.equals("sm")) {
                        b = 197;
                    }
                    break;
                case 3675:
                    if (lowerCase.equals("sn")) {
                        b = 198;
                    }
                    break;
                case 3676:
                    if (lowerCase.equals("so")) {
                        b = 199;
                    }
                    break;
                case 3679:
                    if (lowerCase.equals("sr")) {
                        b = 200;
                    }
                    break;
                case 3680:
                    if (lowerCase.equals("ss")) {
                        b = 201;
                    }
                    break;
                case 3681:
                    if (lowerCase.equals("st")) {
                        b = 202;
                    }
                    break;
                case 3683:
                    if (lowerCase.equals(TranslateLanguage.SWEDISH)) {
                        b = 203;
                    }
                    break;
                case 3685:
                    if (lowerCase.equals("sx")) {
                        b = 204;
                    }
                    break;
                case 3686:
                    if (lowerCase.equals("sy")) {
                        b = 205;
                    }
                    break;
                case 3687:
                    if (lowerCase.equals("sz")) {
                        b = 206;
                    }
                    break;
                case 3695:
                    if (lowerCase.equals("tc")) {
                        b = 207;
                    }
                    break;
                case 3696:
                    if (lowerCase.equals("td")) {
                        b = 208;
                    }
                    break;
                case 3699:
                    if (lowerCase.equals("tg")) {
                        b = 209;
                    }
                    break;
                case 3700:
                    if (lowerCase.equals(TranslateLanguage.THAI)) {
                        b = 210;
                    }
                    break;
                case 3702:
                    if (lowerCase.equals("tj")) {
                        b = 211;
                    }
                    break;
                case 3703:
                    if (lowerCase.equals("tk")) {
                        b = 212;
                    }
                    break;
                case 3704:
                    if (lowerCase.equals(TranslateLanguage.TAGALOG)) {
                        b = 213;
                    }
                    break;
                case 3705:
                    if (lowerCase.equals("tm")) {
                        b = 214;
                    }
                    break;
                case 3706:
                    if (lowerCase.equals("tn")) {
                        b = 215;
                    }
                    break;
                case 3707:
                    if (lowerCase.equals("to")) {
                        b = 216;
                    }
                    break;
                case 3710:
                    if (lowerCase.equals(TranslateLanguage.TURKISH)) {
                        b = 217;
                    }
                    break;
                case 3712:
                    if (lowerCase.equals("tt")) {
                        b = 218;
                    }
                    break;
                case 3714:
                    if (lowerCase.equals("tv")) {
                        b = 219;
                    }
                    break;
                case 3715:
                    if (lowerCase.equals("tw")) {
                        b = 220;
                    }
                    break;
                case 3718:
                    if (lowerCase.equals("tz")) {
                        b = 221;
                    }
                    break;
                case 3724:
                    if (lowerCase.equals("ua")) {
                        b = 222;
                    }
                    break;
                case 3730:
                    if (lowerCase.equals("ug")) {
                        b = 223;
                    }
                    break;
                case 3742:
                    if (lowerCase.equals("us")) {
                        b = 224;
                    }
                    break;
                case 3748:
                    if (lowerCase.equals("uy")) {
                        b = 225;
                    }
                    break;
                case 3749:
                    if (lowerCase.equals("uz")) {
                        b = 226;
                    }
                    break;
                case 3755:
                    if (lowerCase.equals("va")) {
                        b = 227;
                    }
                    break;
                case 3757:
                    if (lowerCase.equals("vc")) {
                        b = 228;
                    }
                    break;
                case 3759:
                    if (lowerCase.equals("ve")) {
                        b = 229;
                    }
                    break;
                case 3761:
                    if (lowerCase.equals("vg")) {
                        b = 230;
                    }
                    break;
                case 3763:
                    if (lowerCase.equals(TranslateLanguage.VIETNAMESE)) {
                        b = 231;
                    }
                    break;
                case 3768:
                    if (lowerCase.equals("vn")) {
                        b = 232;
                    }
                    break;
                case 3775:
                    if (lowerCase.equals("vu")) {
                        b = 233;
                    }
                    break;
                case 3791:
                    if (lowerCase.equals("wf")) {
                        b = 234;
                    }
                    break;
                case 3804:
                    if (lowerCase.equals("ws")) {
                        b = 235;
                    }
                    break;
                case 3827:
                    if (lowerCase.equals("xk")) {
                        b = 236;
                    }
                    break;
                case 3852:
                    if (lowerCase.equals("ye")) {
                        b = 237;
                    }
                    break;
                case 3867:
                    if (lowerCase.equals("yt")) {
                        b = 238;
                    }
                    break;
                case 3879:
                    if (lowerCase.equals("za")) {
                        b = 239;
                    }
                    break;
                case 3891:
                    if (lowerCase.equals("zm")) {
                        b = 240;
                    }
                    break;
                case 3901:
                    if (lowerCase.equals("zw")) {
                        b = 241;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    i = R.drawable.flag_andorra;
                    break;
                case 1:
                    i = R.drawable.flag_uae;
                    break;
                case 2:
                    i = R.drawable.flag_afghanistan;
                    break;
                case 3:
                    i = R.drawable.flag_antigua_and_barbuda;
                    break;
                case 4:
                    i = R.drawable.flag_anguilla;
                    break;
                case 5:
                    i = R.drawable.flag_albania;
                    break;
                case 6:
                    i = R.drawable.flag_armenia;
                    break;
                case 7:
                    i = R.drawable.flag_angola;
                    break;
                case 8:
                    i = R.drawable.flag_antarctica;
                    break;
                case 9:
                    i = R.drawable.flag_argentina;
                    break;
                case 10:
                    i = R.drawable.flag_american_samoa;
                    break;
                case 11:
                    i = R.drawable.flag_austria;
                    break;
                case 12:
                    i = R.drawable.flag_australia;
                    break;
                case 13:
                    i = R.drawable.flag_aruba;
                    break;
                case 14:
                    i = R.drawable.flag_aland;
                    break;
                case 15:
                    i = R.drawable.flag_azerbaijan;
                    break;
                case 16:
                    i = R.drawable.flag_bosnia;
                    break;
                case 17:
                    i = R.drawable.flag_barbados;
                    break;
                case 18:
                    i = R.drawable.flag_bangladesh;
                    break;
                case 19:
                    i = R.drawable.flag_belgium;
                    break;
                case 20:
                    i = R.drawable.flag_burkina_faso;
                    break;
                case 21:
                    i = R.drawable.flag_bulgaria;
                    break;
                case 22:
                    i = R.drawable.flag_bahrain;
                    break;
                case 23:
                    i = R.drawable.flag_burundi;
                    break;
                case 24:
                    i = R.drawable.flag_benin;
                    break;
                case 25:
                    i = R.drawable.flag_saint_barthelemy;
                    break;
                case 26:
                    i = R.drawable.flag_bermuda;
                    break;
                case 27:
                    i = R.drawable.flag_brunei;
                    break;
                case 28:
                    i = R.drawable.flag_bolivia;
                    break;
                case 29:
                    i = R.drawable.flag_brazil;
                    break;
                case 30:
                    i = R.drawable.flag_bahamas;
                    break;
                case 31:
                    i = R.drawable.flag_bhutan;
                    break;
                case 32:
                    i = R.drawable.flag_botswana;
                    break;
                case 33:
                    i = R.drawable.flag_belarus;
                    break;
                case 34:
                    i = R.drawable.flag_belize;
                    break;
                case 35:
                    i = R.drawable.flag_canada;
                    break;
                case 36:
                    i = R.drawable.flag_cocos;
                    break;
                case 37:
                    i = R.drawable.flag_democratic_republic_of_the_congo;
                    break;
                case 38:
                    i = R.drawable.flag_central_african_republic;
                    break;
                case 39:
                    i = R.drawable.flag_republic_of_the_congo;
                    break;
                case 40:
                    i = R.drawable.flag_switzerland;
                    break;
                case 41:
                    i = R.drawable.flag_cote_divoire;
                    break;
                case 42:
                    i = R.drawable.flag_cook_islands;
                    break;
                case 43:
                    i = R.drawable.flag_chile;
                    break;
                case 44:
                    i = R.drawable.flag_cameroon;
                    break;
                case 45:
                    i = R.drawable.flag_china;
                    break;
                case 46:
                    i = R.drawable.flag_colombia;
                    break;
                case 47:
                    i = R.drawable.flag_costa_rica;
                    break;
                case 48:
                    i = R.drawable.flag_cuba;
                    break;
                case 49:
                    i = R.drawable.flag_cape_verde;
                    break;
                case 50:
                    i = R.drawable.flag_curacao;
                    break;
                case 51:
                    i = R.drawable.flag_christmas_island;
                    break;
                case 52:
                    i = R.drawable.flag_cyprus;
                    break;
                case 53:
                    i = R.drawable.flag_czech_republic;
                    break;
                case 54:
                    i = R.drawable.flag_germany;
                    break;
                case 55:
                    i = R.drawable.flag_djibouti;
                    break;
                case 56:
                    i = R.drawable.flag_denmark;
                    break;
                case 57:
                    i = R.drawable.flag_dominica;
                    break;
                case 58:
                    i = R.drawable.flag_dominican_republic;
                    break;
                case 59:
                    i = R.drawable.flag_algeria;
                    break;
                case 60:
                    i = R.drawable.flag_ecuador;
                    break;
                case 61:
                    i = R.drawable.flag_estonia;
                    break;
                case 62:
                    i = R.drawable.flag_egypt;
                    break;
                case 63:
                    i = R.drawable.flag_eritrea;
                    break;
                case 64:
                    i = R.drawable.flag_spain;
                    break;
                case 65:
                    i = R.drawable.flag_ethiopia;
                    break;
                case 66:
                    i = R.drawable.flag_finland;
                    break;
                case 67:
                    i = R.drawable.flag_fiji;
                    break;
                case 68:
                    i = R.drawable.flag_falkland_islands;
                    break;
                case 69:
                    i = R.drawable.flag_micronesia;
                    break;
                case 70:
                    i = R.drawable.flag_faroe_islands;
                    break;
                case 71:
                    i = R.drawable.flag_france;
                    break;
                case 72:
                    i = R.drawable.flag_gabon;
                    break;
                case 73:
                    i = R.drawable.flag_united_kingdom;
                    break;
                case 74:
                    i = R.drawable.flag_grenada;
                    break;
                case 75:
                    i = R.drawable.flag_georgia;
                    break;
                case 76:
                    i = R.drawable.flag_guyane;
                    break;
                case 77:
                    i = R.drawable.flag_guernsey;
                    break;
                case 78:
                    i = R.drawable.flag_ghana;
                    break;
                case 79:
                    i = R.drawable.flag_gibraltar;
                    break;
                case 80:
                    i = R.drawable.flag_greenland;
                    break;
                case 81:
                    i = R.drawable.flag_gambia;
                    break;
                case 82:
                    i = R.drawable.flag_guinea;
                    break;
                case 83:
                    i = R.drawable.flag_guadeloupe;
                    break;
                case 84:
                    i = R.drawable.flag_equatorial_guinea;
                    break;
                case 85:
                    i = R.drawable.flag_greece;
                    break;
                case 86:
                    i = R.drawable.flag_guatemala;
                    break;
                case 87:
                    i = R.drawable.flag_guam;
                    break;
                case 88:
                    i = R.drawable.flag_guinea_bissau;
                    break;
                case 89:
                    i = R.drawable.flag_guyana;
                    break;
                case 90:
                    i = R.drawable.flag_hong_kong;
                    break;
                case 91:
                    i = R.drawable.flag_honduras;
                    break;
                case 92:
                    i = R.drawable.flag_croatia;
                    break;
                case 93:
                    i = R.drawable.flag_haiti;
                    break;
                case 94:
                    i = R.drawable.flag_hungary;
                    break;
                case 95:
                    i = R.drawable.flag_indonesia;
                    break;
                case 96:
                    i = R.drawable.flag_ireland;
                    break;
                case 97:
                    i = R.drawable.flag_israel;
                    break;
                case 98:
                    i = R.drawable.flag_isleof_man;
                    break;
                case 99:
                    i = R.drawable.flag_india;
                    break;
                case 100:
                    i = R.drawable.flag_british_indian_ocean_territory;
                    break;
                case 101:
                    i = R.drawable.flag_iraq_new;
                    break;
                case 102:
                    i = R.drawable.flag_iran;
                    break;
                case 103:
                    i = R.drawable.flag_iceland;
                    break;
                case 104:
                    i = R.drawable.flag_italy;
                    break;
                case 105:
                    i = R.drawable.flag_jersey;
                    break;
                case 106:
                    i = R.drawable.flag_jamaica;
                    break;
                case 107:
                    i = R.drawable.flag_jordan;
                    break;
                case 108:
                    i = R.drawable.flag_japan;
                    break;
                case 109:
                    i = R.drawable.flag_kenya;
                    break;
                case 110:
                    i = R.drawable.flag_kyrgyzstan;
                    break;
                case 111:
                    i = R.drawable.flag_cambodia;
                    break;
                case 112:
                    i = R.drawable.flag_kiribati;
                    break;
                case 113:
                    i = R.drawable.flag_comoros;
                    break;
                case 114:
                    i = R.drawable.flag_saint_kitts_and_nevis;
                    break;
                case 115:
                    i = R.drawable.flag_north_korea;
                    break;
                case 116:
                    i = R.drawable.flag_south_korea;
                    break;
                case 117:
                    i = R.drawable.flag_kuwait;
                    break;
                case 118:
                    i = R.drawable.flag_cayman_islands;
                    break;
                case 119:
                    i = R.drawable.flag_kazakhstan;
                    break;
                case 120:
                    i = R.drawable.flag_laos;
                    break;
                case 121:
                    i = R.drawable.flag_lebanon;
                    break;
                case 122:
                    i = R.drawable.flag_saint_lucia;
                    break;
                case 123:
                    i = R.drawable.flag_liechtenstein;
                    break;
                case 124:
                    i = R.drawable.flag_sri_lanka;
                    break;
                case 125:
                    i = R.drawable.flag_liberia;
                    break;
                case 126:
                    i = R.drawable.flag_lesotho;
                    break;
                case 127:
                    i = R.drawable.flag_lithuania;
                    break;
                case 128:
                    i = R.drawable.flag_luxembourg;
                    break;
                case 129:
                    i = R.drawable.flag_latvia;
                    break;
                case 130:
                    i = R.drawable.flag_libya;
                    break;
                case 131:
                    i = R.drawable.flag_morocco;
                    break;
                case 132:
                    i = R.drawable.flag_monaco;
                    break;
                case 133:
                    i = R.drawable.flag_moldova;
                    break;
                case 134:
                    i = R.drawable.flag_of_montenegro;
                    break;
                case 135:
                    i = R.drawable.flag_saint_martin;
                    break;
                case 136:
                    i = R.drawable.flag_madagascar;
                    break;
                case 137:
                    i = R.drawable.flag_marshall_islands;
                    break;
                case 138:
                    i = R.drawable.flag_macedonia;
                    break;
                case 139:
                    i = R.drawable.flag_mali;
                    break;
                case 140:
                    i = R.drawable.flag_myanmar;
                    break;
                case 141:
                    i = R.drawable.flag_mongolia;
                    break;
                case 142:
                    i = R.drawable.flag_macao;
                    break;
                case 143:
                    i = R.drawable.flag_northern_mariana_islands;
                    break;
                case 144:
                case 182:
                case 238:
                    break;
                case 145:
                    i = R.drawable.flag_mauritania;
                    break;
                case 146:
                    i = R.drawable.flag_montserrat;
                    break;
                case 147:
                    i = R.drawable.flag_malta;
                    break;
                case 148:
                    i = R.drawable.flag_mauritius;
                    break;
                case 149:
                    i = R.drawable.flag_maldives;
                    break;
                case 150:
                    i = R.drawable.flag_malawi;
                    break;
                case 151:
                    i = R.drawable.flag_mexico;
                    break;
                case 152:
                    i = R.drawable.flag_malaysia;
                    break;
                case 153:
                    i = R.drawable.flag_mozambique;
                    break;
                case 154:
                    i = R.drawable.flag_namibia;
                    break;
                case 155:
                    i = R.drawable.flag_new_caledonia;
                    break;
                case 156:
                    i = R.drawable.flag_niger;
                    break;
                case 157:
                    i = R.drawable.flag_norfolk_island;
                    break;
                case 158:
                    i = R.drawable.flag_nigeria;
                    break;
                case 159:
                    i = R.drawable.flag_nicaragua;
                    break;
                case 160:
                    i = R.drawable.flag_netherlands;
                    break;
                case 161:
                    i = R.drawable.flag_norway;
                    break;
                case 162:
                    i = R.drawable.flag_nepal;
                    break;
                case 163:
                    i = R.drawable.flag_nauru;
                    break;
                case 164:
                    i = R.drawable.flag_niue;
                    break;
                case 165:
                    i = R.drawable.flag_new_zealand;
                    break;
                case 166:
                    i = R.drawable.flag_oman;
                    break;
                case 167:
                    i = R.drawable.flag_panama;
                    break;
                case 168:
                    i = R.drawable.flag_peru;
                    break;
                case 169:
                    i = R.drawable.flag_french_polynesia;
                    break;
                case 170:
                    i = R.drawable.flag_papua_new_guinea;
                    break;
                case 171:
                    i = R.drawable.flag_philippines;
                    break;
                case 172:
                    i = R.drawable.flag_pakistan;
                    break;
                case 173:
                    i = R.drawable.flag_poland;
                    break;
                case 174:
                    i = R.drawable.flag_saint_pierre;
                    break;
                case 175:
                    i = R.drawable.flag_pitcairn_islands;
                    break;
                case 176:
                    i = R.drawable.flag_puerto_rico;
                    break;
                case 177:
                    i = R.drawable.flag_palestine;
                    break;
                case 178:
                    i = R.drawable.flag_portugal;
                    break;
                case 179:
                    i = R.drawable.flag_palau;
                    break;
                case 180:
                    i = R.drawable.flag_paraguay;
                    break;
                case 181:
                    i = R.drawable.flag_qatar;
                    break;
                case 183:
                    i = R.drawable.flag_romania;
                    break;
                case 184:
                    i = R.drawable.flag_serbia;
                    break;
                case 185:
                    i = R.drawable.flag_russian_federation;
                    break;
                case 186:
                    i = R.drawable.flag_rwanda;
                    break;
                case 187:
                    i = R.drawable.flag_saudi_arabia;
                    break;
                case 188:
                    i = R.drawable.flag_soloman_islands;
                    break;
                case 189:
                    i = R.drawable.flag_seychelles;
                    break;
                case 190:
                    i = R.drawable.flag_sudan;
                    break;
                case 191:
                    i = R.drawable.flag_sweden;
                    break;
                case 192:
                    i = R.drawable.flag_singapore;
                    break;
                case 193:
                    i = R.drawable.flag_saint_helena;
                    break;
                case 194:
                    i = R.drawable.flag_slovenia;
                    break;
                case 195:
                    i = R.drawable.flag_slovakia;
                    break;
                case 196:
                    i = R.drawable.flag_sierra_leone;
                    break;
                case 197:
                    i = R.drawable.flag_san_marino;
                    break;
                case 198:
                    i = R.drawable.flag_senegal;
                    break;
                case 199:
                    i = R.drawable.flag_somalia;
                    break;
                case 200:
                    i = R.drawable.flag_suriname;
                    break;
                case 201:
                    i = R.drawable.flag_south_sudan;
                    break;
                case 202:
                    i = R.drawable.flag_sao_tome_and_principe;
                    break;
                case 203:
                    i = R.drawable.flag_el_salvador;
                    break;
                case 204:
                    i = R.drawable.flag_sint_maarten;
                    break;
                case 205:
                    i = R.drawable.flag_syria;
                    break;
                case 206:
                    i = R.drawable.flag_swaziland;
                    break;
                case 207:
                    i = R.drawable.flag_turks_and_caicos_islands;
                    break;
                case 208:
                    i = R.drawable.flag_chad;
                    break;
                case 209:
                    i = R.drawable.flag_togo;
                    break;
                case 210:
                    i = R.drawable.flag_thailand;
                    break;
                case 211:
                    i = R.drawable.flag_tajikistan;
                    break;
                case 212:
                    i = R.drawable.flag_tokelau;
                    break;
                case 213:
                    i = R.drawable.flag_timor_leste;
                    break;
                case 214:
                    i = R.drawable.flag_turkmenistan;
                    break;
                case 215:
                    i = R.drawable.flag_tunisia;
                    break;
                case 216:
                    i = R.drawable.flag_tonga;
                    break;
                case 217:
                    i = R.drawable.flag_turkey;
                    break;
                case 218:
                    i = R.drawable.flag_trinidad_and_tobago;
                    break;
                case 219:
                    i = R.drawable.flag_tuvalu;
                    break;
                case 220:
                    i = R.drawable.flag_taiwan;
                    break;
                case 221:
                    i = R.drawable.flag_tanzania;
                    break;
                case 222:
                    i = R.drawable.flag_ukraine;
                    break;
                case 223:
                    i = R.drawable.flag_uganda;
                    break;
                case 224:
                    i = R.drawable.flag_united_states_of_america;
                    break;
                case 225:
                    i = R.drawable.flag_uruguay;
                    break;
                case 226:
                    i = R.drawable.flag_uzbekistan;
                    break;
                case 227:
                    i = R.drawable.flag_vatican_city;
                    break;
                case 228:
                    i = R.drawable.flag_saint_vicent_and_the_grenadines;
                    break;
                case 229:
                    i = R.drawable.flag_venezuela;
                    break;
                case 230:
                    i = R.drawable.flag_british_virgin_islands;
                    break;
                case 231:
                    i = R.drawable.flag_us_virgin_islands;
                    break;
                case 232:
                    i = R.drawable.flag_vietnam;
                    break;
                case 233:
                    i = R.drawable.flag_vanuatu;
                    break;
                case 234:
                    i = R.drawable.flag_wallis_and_futuna;
                    break;
                case 235:
                    i = R.drawable.flag_samoa;
                    break;
                case 236:
                    i = R.drawable.flag_kosovo;
                    break;
                case 237:
                    i = R.drawable.flag_yemen;
                    break;
                case 239:
                    i = R.drawable.flag_south_africa;
                    break;
                case 240:
                    i = R.drawable.flag_zambia;
                    break;
                case 241:
                    i = R.drawable.flag_zimbabwe;
                    break;
                default:
                    i = R.drawable.flag_transparent;
                    break;
            }
            oooO00o.f68807OooOoOO = i;
        }
        imageView.setImageResource(oooO00o.f68807OooOoOO);
        OooO0OO();
        OooO0Oo();
        EditText editText = this.f68747OooOoO;
        this.f68776Ooooo0o = true;
        if (this.f68779OooooOo) {
            try {
                editText.setSelection(this.f68778OooooOO);
                this.f68779OooooOo = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f68786o00Oo0 = com.hbb20.OooO0O0.OooO0O0(getSelectedCountryCodeAsInt());
    }

    public void setShowFastScroller(boolean z) {
    }

    public void setShowPhoneCode(boolean z) {
        this.f68758Oooo00o = z;
        setSelectedCountry(this.f68750OooOoo);
    }

    public void setTalkBackTextProvider(p618o0.OooO00o oooO00o) {
        setSelectedCountry(this.f68750OooOoo);
    }

    public void setTextSize(int i) {
        if (i > 0) {
            this.f68748OooOoO0.setTextSize(0, i);
            setArrowSize(i);
            setFlagSize(i);
        }
    }

    public void setTextView_selectedCountry(TextView textView) {
        this.f68748OooOoO0 = textView;
    }

    public void setTypeFace(Typeface typeface) {
        try {
            this.f68748OooOoO0.setTypeface(typeface);
            setDialogTypeFace(typeface);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
