package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.p559ms.System.C14080ne;
import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18385v2;
import com.microsoft.identity.common.java.eststelemetry.PublicApiId;
import com.microsoft.identity.common.java.marker.PerfConstants;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.miui.penengine.p596e.C18773h;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.cloud.NoteInDriveError;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.q3 */
/* JADX INFO: loaded from: classes3.dex */
public class C2254q3 implements IGenericDictionary<Integer, String> {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<Integer, String> f7757k4 = new Dictionary<>();

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void clear() {
        this.f7757k4.clear();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final IGenericCollection<Integer> getKeys() {
        return this.f7757k4.getKeys();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final IGenericCollection<String> getValues() {
        return this.f7757k4.getValues();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean isReadOnly() {
        throw new NotImplementedException();
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<KeyValuePair<Integer, String>> iterator() {
        return this.f7757k4.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m11258k4(int i) {
        String[] strArr = {null};
        this.f7757k4.tryGetValue(Integer.valueOf(i), strArr);
        return strArr[0];
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public final String get_Item(Integer num) {
        return m11258k4(num.intValue());
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final int size() {
        return this.f7757k4.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11270x1(int i, String str) {
        this.f7757k4.set_Item(Integer.valueOf(i), str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11259k4() {
        m11263k4(TelemetryEventStrings.Api.LOCAL_ACQUIRE_TOKEN_INTERACTIVE, C18385v2.f56336h);
        m11263k4("341", "AE");
        m11263k4("102", "B");
        m11263k4(TelemetryEventStrings.Api.LOCAL_ACQUIRE_TOKEN_SILENT, "C");
        m11263k4("104", "D");
        m11263k4("105", "E");
        m11263k4(TelemetryEventStrings.Api.LOCAL_GET_ACCOUNTS, "F");
        m11263k4(TelemetryEventStrings.Api.LOCAL_REMOVE_ACCOUNT, "G");
        m11263k4("110", "H");
        m11263k4(NoteInDriveError.ERROR_UNKNOW, "I");
        m11263k4("112", "J");
        m11263k4("113", "K");
        m11263k4("114", "L");
        m11263k4("350", "Lslash");
        m11263k4("115", "M");
        m11263k4("116", "N");
        m11263k4("117", "O");
        m11263k4("352", "OE");
        m11263k4("351", "Oslash");
        m11263k4("120", "P");
        m11263k4(PublicApiId.PCA_ACQUIRE_TOKEN_WITH_PARAMETERS, "Q");
        m11263k4(PublicApiId.PCA_ACQUIRE_TOKEN_WITH_ACTIVITY_SCOPES_CALLBACK, "R");
        m11263k4(PublicApiId.SINGLE_ACCOUNT_PCA_SIGN_IN, "S");
        m11263k4(PublicApiId.SINGLE_ACCOUNT_PCA_ACQUIRE_TOKEN_WITH_PARAMETERS, "T");
        m11263k4(PublicApiId.SINGLE_ACCOUNT_PCA_ACQUIRE_TOKEN_WITH_ACTIVITY_SCOPES_CALLBACK, "U");
        m11263k4(PublicApiId.f57075x7e2b03bc, "V");
        m11263k4(PublicApiId.BROKER_ACQUIRE_TOKEN_WITH_PARAMETERS_CALLBACK, "W");
        m11263k4(PublicApiId.SINGLE_ACCOUNT_PCA_SIGN_IN_WITH_PROMPT, "X");
        m11263k4(PublicApiId.SINGLE_ACCOUNT_PCA_EXISTING_SIGN_IN_WITH_PROMPT, "Y");
        m11263k4(PublicApiId.SINGLE_ACCOUNT_PCA_SIGN_IN_WITH_PARAMETERS, "Z");
        m11263k4("141", "a");
        m11263k4(TelemetryEventStrings.BrokerApi.ACQUIRE_TOKEN_INTERACTIVE, "acute");
        m11263k4("361", "ae");
        m11263k4("046", "ampersand");
        m11263k4(PublicApiId.MULTIPLE_ACCOUNT_PCA_ACQUIRE_TOKEN_WITH_PARAMETERS, "asciicircum");
        m11263k4("176", "asciitilde");
        m11263k4("052", "asterisk");
        m11263k4(PerfConstants.ScenarioConstants.SCENARIO_NON_BROKERED_ACQUIRE_TOKEN_SILENTLY, "at");
        m11263k4("142", "b");
        m11263k4(PublicApiId.SINGLE_ACCOUNT_PCA_EXISTING_SIGN_IN_WITH_PARAMETERS, "backslash");
        m11263k4("174", "bar");
        m11263k4("173", "braceleft");
        m11263k4("175", "braceright");
        m11263k4(PublicApiId.SINGLE_ACCOUNT_PCA_SIGN_IN_WITH_PARAMETERS_PROMPT, "bracketleft");
        m11263k4(PublicApiId.SINGLE_ACCOUNT_PCA_EXISTING_SIGN_IN_WITH_PARAMETERS_PROMPT, "bracketright");
        m11263k4("306", "breve");
        m11263k4("267", "bullet");
        m11263k4("143", "c");
        m11263k4("317", "caron");
        m11263k4("313", "cedilla");
        m11263k4("242", "cent");
        m11263k4("303", "circumflex");
        m11263k4("072", "colon");
        m11263k4("054", "comma");
        m11263k4(PublicApiId.NATIVE_AUTH_ACCOUNT_GET_ACCESS_TOKEN, FirebaseAnalytics.Param.CURRENCY);
        m11263k4("144", "d");
        m11263k4("262", "dagger");
        m11263k4("263", "daggerdbl");
        m11263k4("310", "dieresis");
        m11263k4("044", "dollar");
        m11263k4("307", "dotaccent");
        m11263k4("365", "dotlessi");
        m11263k4("145", "e");
        m11263k4("070", "eight");
        m11263k4("274", "ellipsis");
        m11263k4("320", "emdash");
        m11263k4("261", "endash");
        m11263k4("075", "equal");
        m11263k4("041", "exclam");
        m11263k4("241", "exclamdown");
        m11263k4("146", "f");
        m11263k4("256", TranslateLanguage.FINNISH);
        m11263k4("065", "five");
        m11263k4("257", "fl");
        m11263k4("246", "florin");
        m11263k4("064", "four");
        m11263k4("244", "fraction");
        m11263k4("147", "g");
        m11263k4("373", "germandbls");
        m11263k4(TelemetryEventStrings.BrokerApi.ACQUIRE_TOKEN_SILENT, "grave");
        m11263k4("076", "greater");
        m11263k4("253", "guillemotleft");
        m11263k4("273", "guillemotright");
        m11263k4("254", "guilsinglleft");
        m11263k4("255", "guilsinglright");
        m11263k4("150", C18773h.f57233c);
        m11263k4("315", "hungarumlaut");
        m11263k4("055", "hyphen");
        m11263k4("151", ContextChain.TAG_INFRA);
        m11263k4("152", "j");
        m11263k4("153", "k");
        m11263k4("154", "l");
        m11263k4("074", "less");
        m11263k4("370", "lslash");
        m11263k4("155", "m");
        m11263k4("305", "macron");
        m11263k4("156", BackupFile.PREFIX_NOTE_DIR);
        m11263k4("071", "nine");
        m11263k4("043", "numbersign");
        m11263k4("157", "o");
        m11263k4("372", "oe");
        m11263k4("316", "ogonek");
        m11263k4("061", "one");
        m11263k4("343", "ordfeminine");
        m11263k4("353", "ordmasculine");
        m11263k4("371", "oslash");
        m11263k4("160", ContextChain.TAG_PRODUCT);
        m11263k4("266", "paragraph");
        m11263k4("050", "parenleft");
        m11263k4("051", "parenright");
        m11263k4("045", "percent");
        m11263k4("056", "period");
        m11263k4("264", "periodcentered");
        m11263k4("275", "perthousand");
        m11263k4("053", "plus");
        m11263k4("161", "q");
        m11263k4("077", "question");
        m11263k4("277", "questiondown");
        m11263k4("042", "quotedbl");
        m11263k4("271", "quotedblbase");
        m11263k4("252", "quotedblleft");
        m11263k4("272", "quotedblright");
        m11263k4("140", "quoteleft");
        m11263k4("047", "quoteright");
        m11263k4("270", "quotesinglbase");
        m11263k4("251", "quotesingle");
        m11263k4("162", "r");
        m11263k4("312", "ring");
        m11263k4("163", "s");
        m11263k4("247", "section");
        m11263k4("073", "semicolon");
        m11263k4("067", "seven");
        m11263k4("066", "six");
        m11263k4("057", "slash");
        m11263k4("040", "space");
        m11263k4("243", "sterling");
        m11263k4("164", "t");
        m11263k4("063", "three");
        m11263k4("304", "tilde");
        m11263k4("062", "two");
        m11263k4("165", "u");
        m11263k4("137", "underscore");
        m11263k4("166", "v");
        m11263k4("167", "w");
        m11263k4("170", "x");
        m11263k4("171", "y");
        m11263k4("245", "yen");
        m11263k4("172", "z");
        m11263k4("060", "zero");
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public final boolean removeItem(KeyValuePair<Integer, String> keyValuePair) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final void set_Item(Integer num, String str) {
        Dictionary<Integer, String> dictionary = this.f7757k4;
        num.intValue();
        dictionary.set_Item(num, str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11260k4(int i, String str) {
        this.f7757k4.set_Item(Integer.valueOf(i), str);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final boolean containsItem(KeyValuePair<Integer, String> keyValuePair) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final void addItem(KeyValuePair<Integer, String> keyValuePair) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final boolean removeItemByKey(Integer num) {
        return this.f7757k4.removeItemByKey(num);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final void addItem(Integer num, String str) {
        this.f7757k4.set_Item(num, str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11263k4(String str, String str2) {
        m11270x1(C14080ne.m67044x1(str, 8), str2);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final void copyToTArray(KeyValuePair<Integer, String>[] keyValuePairArr, int i) {
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m11265k4(int i, String[] strArr) {
        return this.f7757k4.tryGetValue(Integer.valueOf(i), strArr);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final boolean containsKey(Integer num) {
        return this.f7757k4.containsKey(num);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final boolean tryGetValue(Integer num, Object[] objArr) {
        return m11265k4(num.intValue(), (String[]) objArr);
    }
}
