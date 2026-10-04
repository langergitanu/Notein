package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class MailMergeRegionInfo {
    private String mName;
    private ArrayList<MailMergeRegionInfo> zzQ4;
    private MustacheTag zzY4Q;
    private FieldMergeField zzY4R;
    private MustacheTag zzY4S;
    private FieldMergeField zzY4T;
    private ArrayList<MustacheTag> zzY4U;
    private MailMergeRegionInfo zzY4V;
    private ArrayList<Field> zzYEO;
    private int zzYw;

    public MailMergeRegionInfo() {
        this.zzQ4 = new ArrayList<>();
        this.zzYEO = new ArrayList<>();
        this.zzY4U = new ArrayList<>();
    }

    private void zzIF(String str) {
        if (!zzZZy()) {
            throw new IllegalStateException("Misplaced mail merge region end mark.");
        }
        if (!com.aspose.words.internal.zzZYD.zzi(getName(), str)) {
            throw new IllegalStateException(zzYJg());
        }
        if (zzZZx()) {
            throw new IllegalStateException(zzYJg());
        }
    }

    private String zzYJg() {
        return com.aspose.words.internal.zzZKN.format("Mail merge region '{0}' is badly formed.", getName());
    }

    private boolean zzZZx() {
        return (getEndField() == null && getEndMustacheTag() == null) ? false : true;
    }

    private boolean zzZZy() {
        return (getStartField() == null && getStartMustacheTag() == null) ? false : true;
    }

    public FieldMergeField getEndField() {
        return this.zzY4R;
    }

    public MustacheTag getEndMustacheTag() {
        return this.zzY4Q;
    }

    public ArrayList<Field> getFields() {
        return this.zzYEO;
    }

    public int getLevel() {
        return this.zzYw;
    }

    public ArrayList<MustacheTag> getMustacheTags() {
        return this.zzY4U;
    }

    public String getName() {
        return this.mName;
    }

    public MailMergeRegionInfo getParentRegion() {
        return this.zzY4V;
    }

    public ArrayList<MailMergeRegionInfo> getRegions() {
        return this.zzQ4;
    }

    public FieldMergeField getStartField() {
        return this.zzY4T;
    }

    public MustacheTag getStartMustacheTag() {
        return this.zzY4S;
    }

    public final void zzY(FieldMergeField fieldMergeField) {
        zzIF(fieldMergeField.getFieldNameNoPrefix());
        this.zzY4R = fieldMergeField;
    }

    public final void zzZ(MustacheTag mustacheTag) {
        zzIF(mustacheTag.zzYBs().getFieldName());
        this.zzY4Q = mustacheTag;
    }

    public final void zztF() {
        if (zzZZy() && !zzZZx()) {
            throw new IllegalStateException("Non-closed mail merge region(s).");
        }
    }

    private MailMergeRegionInfo(MailMergeRegionInfo mailMergeRegionInfo, String str) {
        this();
        this.mName = str;
        this.zzY4V = mailMergeRegionInfo;
        this.zzYw = getParentRegion().getLevel() + 1;
        getParentRegion().getRegions().add(this);
    }

    public MailMergeRegionInfo(FieldMergeField fieldMergeField, MailMergeRegionInfo mailMergeRegionInfo) {
        this(mailMergeRegionInfo, fieldMergeField.getFieldNameNoPrefix());
        this.zzY4T = fieldMergeField;
    }

    public MailMergeRegionInfo(MustacheTag mustacheTag, MailMergeRegionInfo mailMergeRegionInfo) {
        this(mailMergeRegionInfo, mustacheTag.zzYBs().getFieldName());
        this.zzY4S = mustacheTag;
    }
}
