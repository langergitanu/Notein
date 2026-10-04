package com.orion.notein.domain.models.transactions.google;

import com.facebook.soloader.OooOo;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R#\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u000e\u0010 \u001a\u00020!X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020!X\u0086T¢\u0006\u0002\n\u0000¨\u0006$"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/GoogleBillingConstants;", "", "<init>", "()V", "GOOGLE_VIP_BASIC_SUB", "", "GOOGLE_VIP_BASIC_IN_APP", "GOOGLE_AI_QUOTA_1_IN_APP", "GOOGLE_AI_QUOTA_10_IN_APP", "GOOGLE_VIP_MONTHLY_PLAN_ID", "GOOGLE_VIP_YEARLY_PLAN_ID", "GOOGLE_VIP_YEAR_PREPAID_PLAN_ID", "GOOGLE_TAG_AUTO_RENEWING", "GOOGLE_TAG_PREPAID", "GOOGLE_TAG_FREE_TRIAL", "GOOGLE_TAG_DISCOUNT", "GOOGLE_TAG_DEV", "GOOGLE_TAG_DISCOUNT_10_OFF", "GOOGLE_TAG_DISCOUNT_20_OFF", "GOOGLE_TAG_DISCOUNT_30_OFF", "GOOGLE_TAG_DISCOUNT_40_OFF", "GOOGLE_TAG_DISCOUNT_50_OFF", "GOOGLE_TAG_DISCOUNT_TYPE_1", "GOOGLE_TAG_PREFIX_DISCOUNT_TYPE", "GOOGLE_TAG_SUFFIX_DISCOUNT_FREE_TRIAL", "DEFAULT_ELIGIBLE_VIP_PRODUCT", "", "", "getDEFAULT_ELIGIBLE_VIP_PRODUCT", "()Ljava/util/Map;", "DEFAULT_ELIGIBLE_AI_QUOTA_PRODUCT", "getDEFAULT_ELIGIBLE_AI_QUOTA_PRODUCT", "GOOGLE_FREE_TRIAL_OK", "", "GOOGLE_FREE_TRIAL_ABNORMAL_TIME", "GOOGLE_FREE_TRIAL_OTHER_ERROR", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class GoogleBillingConstants {
    private static final Map<String, List<String>> DEFAULT_ELIGIBLE_AI_QUOTA_PRODUCT;
    private static final Map<String, List<String>> DEFAULT_ELIGIBLE_VIP_PRODUCT;
    public static final String GOOGLE_AI_QUOTA_10_IN_APP = "ai_quota_2_m";
    public static final String GOOGLE_AI_QUOTA_1_IN_APP = "ai_quota_0_2_m";
    public static final int GOOGLE_FREE_TRIAL_ABNORMAL_TIME = -1;
    public static final int GOOGLE_FREE_TRIAL_OK = 0;
    public static final int GOOGLE_FREE_TRIAL_OTHER_ERROR = -999;
    public static final String GOOGLE_TAG_AUTO_RENEWING = "auto-renewing";
    public static final String GOOGLE_TAG_DEV = "dev";
    public static final String GOOGLE_TAG_DISCOUNT = "discount";
    public static final String GOOGLE_TAG_DISCOUNT_10_OFF = "discount-10-off";
    public static final String GOOGLE_TAG_DISCOUNT_20_OFF = "discount-20-off";
    public static final String GOOGLE_TAG_DISCOUNT_30_OFF = "discount-30-off";
    public static final String GOOGLE_TAG_DISCOUNT_40_OFF = "discount-40-off";
    public static final String GOOGLE_TAG_DISCOUNT_50_OFF = "discount-50-off";
    public static final String GOOGLE_TAG_DISCOUNT_TYPE_1 = "type-1";
    public static final String GOOGLE_TAG_FREE_TRIAL = "free-trial";
    public static final String GOOGLE_TAG_PREFIX_DISCOUNT_TYPE = "type-";
    public static final String GOOGLE_TAG_PREPAID = "prepaid";
    public static final String GOOGLE_TAG_SUFFIX_DISCOUNT_FREE_TRIAL = "-free-trial";
    public static final String GOOGLE_VIP_BASIC_IN_APP = "vip_in_app";
    public static final String GOOGLE_VIP_BASIC_SUB = "vip_subscription";
    public static final String GOOGLE_VIP_MONTHLY_PLAN_ID = "monthly-auto-renewing";
    public static final String GOOGLE_VIP_YEARLY_PLAN_ID = "yearly-auto-renewing";
    public static final String GOOGLE_VIP_YEAR_PREPAID_PLAN_ID = "year-prepaid";
    public static final GoogleBillingConstants INSTANCE = new GoogleBillingConstants();

    static {
        C32443OooOOO c32443OooOOO = new C32443OooOOO(GOOGLE_VIP_BASIC_SUB, OooOo.OooO0oO(GOOGLE_VIP_YEARLY_PLAN_ID));
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        DEFAULT_ELIGIBLE_VIP_PRODUCT = C34444Oooo0O0.OooO0oo(c32443OooOOO, new C32443OooOOO(GOOGLE_VIP_BASIC_IN_APP, c34434OooOoO));
        DEFAULT_ELIGIBLE_AI_QUOTA_PRODUCT = C34444Oooo0O0.OooO0oo(new C32443OooOOO(GOOGLE_AI_QUOTA_1_IN_APP, c34434OooOoO), new C32443OooOOO(GOOGLE_AI_QUOTA_10_IN_APP, c34434OooOoO));
    }

    private GoogleBillingConstants() {
    }

    public final Map<String, List<String>> getDEFAULT_ELIGIBLE_AI_QUOTA_PRODUCT() {
        return DEFAULT_ELIGIBLE_AI_QUOTA_PRODUCT;
    }

    public final Map<String, List<String>> getDEFAULT_ELIGIBLE_VIP_PRODUCT() {
        return DEFAULT_ELIGIBLE_VIP_PRODUCT;
    }
}
