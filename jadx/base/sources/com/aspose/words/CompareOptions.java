package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class CompareOptions {
    private boolean zzZtY;
    private int zzZtZ;
    private boolean zzZu0;
    private boolean zzZu1;
    private boolean zzZu2;
    private boolean zzZu3;
    private boolean zzZu4;
    private boolean zzZu5;
    private boolean zzZu6;
    private boolean zzZu7;
    private boolean zzZu8;
    private int zzZu9 = 1;

    public boolean getCompareMoves() {
        return this.zzZu8;
    }

    public int getGranularity() {
        return this.zzZu9;
    }

    public boolean getIgnoreCaseChanges() {
        return this.zzZu7;
    }

    public boolean getIgnoreComments() {
        return this.zzZu3;
    }

    public boolean getIgnoreDmlUniqueId() {
        return this.zzZtY;
    }

    public boolean getIgnoreFields() {
        return this.zzZu5;
    }

    public boolean getIgnoreFootnotes() {
        return this.zzZu4;
    }

    public boolean getIgnoreFormatting() {
        return this.zzZu1;
    }

    public boolean getIgnoreHeadersAndFooters() {
        return this.zzZu0;
    }

    public boolean getIgnoreTables() {
        return this.zzZu6;
    }

    public boolean getIgnoreTextboxes() {
        return this.zzZu2;
    }

    public int getTarget() {
        return this.zzZtZ;
    }

    public void setCompareMoves(boolean z) {
        this.zzZu8 = z;
    }

    public void setGranularity(int i) {
        this.zzZu9 = i;
    }

    public void setIgnoreCaseChanges(boolean z) {
        this.zzZu7 = z;
    }

    public void setIgnoreComments(boolean z) {
        this.zzZu3 = z;
    }

    public void setIgnoreDmlUniqueId(boolean z) {
        this.zzZtY = z;
    }

    public void setIgnoreFields(boolean z) {
        this.zzZu5 = z;
    }

    public void setIgnoreFootnotes(boolean z) {
        this.zzZu4 = z;
    }

    public void setIgnoreFormatting(boolean z) {
        this.zzZu1 = z;
    }

    public void setIgnoreHeadersAndFooters(boolean z) {
        this.zzZu0 = z;
    }

    public void setIgnoreTables(boolean z) {
        this.zzZu6 = z;
    }

    public void setIgnoreTextboxes(boolean z) {
        this.zzZu2 = z;
    }

    public void setTarget(int i) {
        this.zzZtZ = i;
    }

    public final boolean zzZZ3() {
        return getIgnoreFormatting() && getTarget() == 1;
    }

    public final boolean zzZZ4() {
        return getIgnoreFormatting() && getTarget() == 0;
    }
}
