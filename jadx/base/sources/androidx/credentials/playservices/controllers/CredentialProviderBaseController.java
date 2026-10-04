package androidx.credentials.playservices.controllers;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.ResultReceiver;
import androidx.core.app.NotificationCompat;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000OO.C24159OooO0o0;
import o0000OO.C24160OooO0oO;
import o0000OO.C24161OooO0oo;
import o0000OO.C24162OooOO0o;
import o0000OO.C24163OooOOOo;
import o0000OO.OooO;
import o0000OO.OooO0o;
import o0000OO.OooOO0O;
import oOo000Oo.OooOOO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u0004\u0018\u00010\u0006\"\n\b\u0000\u0010\u0007*\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0014"}, m80612d2 = {"Landroidx/credentials/playservices/controllers/CredentialProviderBaseController;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/os/ResultReceiver;", "T", "resultReceiver", "toIpcFriendlyResultReceiver", "(Landroid/os/ResultReceiver;)Landroid/os/ResultReceiver;", "Landroid/content/Intent;", "hiddenIntent", "", "typeTag", "LoO00ooO/OooOooO;", "generateHiddenActivityIntent", "(Landroid/os/ResultReceiver;Landroid/content/Intent;Ljava/lang/String;)V", "Landroid/content/Context;", "Companion", "credentials-play-services-auth_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public class CredentialProviderBaseController {
    public static final String ACTIVITY_REQUEST_CODE_TAG = "ACTIVITY_REQUEST_CODE";
    public static final String BEGIN_SIGN_IN_TAG = "BEGIN_SIGN_IN";
    public static final String CREATE_CANCELED = "CREATE_CANCELED";
    public static final String CREATE_INTERRUPTED = "CREATE_INTERRUPTED";
    public static final String CREATE_PASSWORD_TAG = "CREATE_PASSWORD";
    public static final String CREATE_PUBLIC_KEY_CREDENTIAL_TAG = "CREATE_PUBLIC_KEY_CREDENTIAL";
    public static final String CREATE_UNKNOWN = "CREATE_UNKNOWN";
    public static final String EXCEPTION_MESSAGE_TAG = "EXCEPTION_MESSAGE";
    public static final String EXCEPTION_TYPE_TAG = "EXCEPTION_TYPE";
    public static final String FAILURE_RESPONSE_TAG = "FAILURE_RESPONSE";
    public static final String GET_CANCELED = "GET_CANCELED_TAG";
    public static final String GET_INTERRUPTED = "GET_INTERRUPTED";
    public static final String GET_NO_CREDENTIALS = "GET_NO_CREDENTIALS";
    public static final String GET_UNKNOWN = "GET_UNKNOWN";
    public static final String REQUEST_TAG = "REQUEST_TYPE";
    public static final String RESULT_DATA_TAG = "RESULT_DATA";
    public static final String RESULT_RECEIVER_TAG = "RESULT_RECEIVER";
    public static final String SIGN_IN_INTENT_TAG = "SIGN_IN_INTENT";
    public static final String TYPE_TAG = "TYPE";
    private final Context context;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<Integer> retryables = OooOOO.OoooOo0(new Integer[]{7, 20});
    private static final int CONTROLLER_REQUEST_CODE = 1;

    @Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0019\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\f\u0010\rR \u0010\u0010\u001a\u00020\u000f8\u0004X\u0085D¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001bR\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001bR\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001bR\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u001bR\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u001bR\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u001bR\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u001bR\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u001bR\u0014\u0010*\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u001bR\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u001bR\u0014\u0010,\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u001bR\u0014\u0010-\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u001b¨\u0006."}, m80612d2 = {"Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;", "", "<init>", "()V", "", "typeName", NotificationCompat.CATEGORY_MESSAGE, "Lo0000OO/OooOO0O;", "getCredentialExceptionTypeToException$credentials_play_services_auth_release", "(Ljava/lang/String;Ljava/lang/String;)Lo0000OO/OooOO0O;", "getCredentialExceptionTypeToException", "Lo0000OO/OooO0o;", "createCredentialExceptionTypeToException$credentials_play_services_auth_release", "(Ljava/lang/String;Ljava/lang/String;)Lo0000OO/OooO0o;", "createCredentialExceptionTypeToException", "", "CONTROLLER_REQUEST_CODE", "I", "getCONTROLLER_REQUEST_CODE", "()I", "getCONTROLLER_REQUEST_CODE$annotations", "", "retryables", "Ljava/util/Set;", "getRetryables", "()Ljava/util/Set;", "ACTIVITY_REQUEST_CODE_TAG", "Ljava/lang/String;", "BEGIN_SIGN_IN_TAG", CredentialProviderBaseController.CREATE_CANCELED, CredentialProviderBaseController.CREATE_INTERRUPTED, "CREATE_PASSWORD_TAG", "CREATE_PUBLIC_KEY_CREDENTIAL_TAG", CredentialProviderBaseController.CREATE_UNKNOWN, "EXCEPTION_MESSAGE_TAG", "EXCEPTION_TYPE_TAG", "FAILURE_RESPONSE_TAG", "GET_CANCELED", CredentialProviderBaseController.GET_INTERRUPTED, CredentialProviderBaseController.GET_NO_CREDENTIALS, CredentialProviderBaseController.GET_UNKNOWN, "REQUEST_TAG", "RESULT_DATA_TAG", "RESULT_RECEIVER_TAG", "SIGN_IN_INTENT_TAG", "TYPE_TAG", "credentials-play-services-auth_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public static /* synthetic */ void getCONTROLLER_REQUEST_CODE$annotations() {
        }

        /* JADX INFO: renamed from: createCredentialExceptionTypeToException$credentials_play_services_auth_release */
        public final OooO0o m35x5e74af(String typeName, String msg) {
            return OooOOO0.OooO0O0(typeName, CredentialProviderBaseController.CREATE_CANCELED) ? new C24159OooO0o0(msg) : OooOOO0.OooO0O0(typeName, CredentialProviderBaseController.CREATE_INTERRUPTED) ? new C24160OooO0oO("android.credentials.CreateCredentialException.TYPE_INTERRUPTED", msg) : new C24161OooO0oo(msg);
        }

        public final int getCONTROLLER_REQUEST_CODE() {
            return CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        }

        /* JADX INFO: renamed from: getCredentialExceptionTypeToException$credentials_play_services_auth_release */
        public final OooOO0O m36xd975db95(String typeName, String msg) {
            if (typeName != null) {
                int iHashCode = typeName.hashCode();
                if (iHashCode != -1567968963) {
                    if (iHashCode != -154594663) {
                        if (iHashCode == 1996705159 && typeName.equals(CredentialProviderBaseController.GET_NO_CREDENTIALS)) {
                            return new C24163OooOOOo(msg);
                        }
                    } else if (typeName.equals(CredentialProviderBaseController.GET_INTERRUPTED)) {
                        return new C24162OooOO0o(msg);
                    }
                } else if (typeName.equals(CredentialProviderBaseController.GET_CANCELED)) {
                    return new OooO(msg);
                }
            }
            return new o0000OO.OooOOO(msg);
        }

        public final Set<Integer> getRetryables() {
            return CredentialProviderBaseController.retryables;
        }

        private Companion() {
        }
    }

    public CredentialProviderBaseController(Context context) {
        OooOOO0.OooO0oO(context, "context");
        this.context = context;
    }

    public static final int getCONTROLLER_REQUEST_CODE() {
        return INSTANCE.getCONTROLLER_REQUEST_CODE();
    }

    public final void generateHiddenActivityIntent(ResultReceiver resultReceiver, Intent hiddenIntent, String typeTag) {
        OooOOO0.OooO0oO(resultReceiver, "resultReceiver");
        OooOOO0.OooO0oO(hiddenIntent, "hiddenIntent");
        OooOOO0.OooO0oO(typeTag, "typeTag");
        hiddenIntent.putExtra(TYPE_TAG, typeTag);
        hiddenIntent.putExtra(ACTIVITY_REQUEST_CODE_TAG, CONTROLLER_REQUEST_CODE);
        hiddenIntent.putExtra(RESULT_RECEIVER_TAG, toIpcFriendlyResultReceiver(resultReceiver));
        hiddenIntent.setFlags(65536);
    }

    public final <T extends ResultReceiver> ResultReceiver toIpcFriendlyResultReceiver(T resultReceiver) {
        Parcel parcelObtain = Parcel.obtain();
        OooOOO0.OooO0o(parcelObtain, "obtain()");
        OooOOO0.OooO0Oo(resultReceiver);
        resultReceiver.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return resultReceiver2;
    }
}
