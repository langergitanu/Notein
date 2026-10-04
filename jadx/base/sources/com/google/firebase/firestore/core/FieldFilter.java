package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.p565v1.Value;
import com.orion.notein.domain.models.backup.BackupFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class FieldFilter extends Filter {
    private final FieldPath field;
    private final Operator operator;
    private final Value value;

    /* JADX INFO: renamed from: com.google.firebase.firestore.core.FieldFilter$1 */
    public static /* synthetic */ class C170571 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$firestore$core$FieldFilter$Operator */
        static final /* synthetic */ int[] f51774x833e630d;

        static {
            int[] iArr = new int[Operator.values().length];
            f51774x833e630d = iArr;
            try {
                iArr[Operator.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51774x833e630d[Operator.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51774x833e630d[Operator.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51774x833e630d[Operator.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51774x833e630d[Operator.GREATER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51774x833e630d[Operator.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum Operator {
        LESS_THAN("<"),
        LESS_THAN_OR_EQUAL("<="),
        EQUAL("=="),
        NOT_EQUAL("!="),
        GREATER_THAN(">"),
        GREATER_THAN_OR_EQUAL(">="),
        ARRAY_CONTAINS("array_contains"),
        ARRAY_CONTAINS_ANY("array_contains_any"),
        IN(BackupFile.EXTENSION_NOTEIN_FILE),
        NOT_IN("not_in");

        private final String text;

        Operator(String str) {
            this.text = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.text;
        }
    }

    public FieldFilter(FieldPath fieldPath, Operator operator, Value value) {
        this.field = fieldPath;
        this.operator = operator;
        this.value = value;
    }

    public static FieldFilter create(FieldPath fieldPath, Operator operator, Value value) {
        if (!fieldPath.isKeyField()) {
            return operator == Operator.ARRAY_CONTAINS ? new ArrayContainsFilter(fieldPath, value) : operator == Operator.IN ? new InFilter(fieldPath, value) : operator == Operator.ARRAY_CONTAINS_ANY ? new ArrayContainsAnyFilter(fieldPath, value) : operator == Operator.NOT_IN ? new NotInFilter(fieldPath, value) : new FieldFilter(fieldPath, operator, value);
        }
        if (operator == Operator.IN) {
            return new KeyFieldInFilter(fieldPath, value);
        }
        if (operator == Operator.NOT_IN) {
            return new KeyFieldNotInFilter(fieldPath, value);
        }
        Assert.hardAssert((operator == Operator.ARRAY_CONTAINS || operator == Operator.ARRAY_CONTAINS_ANY) ? false : true, operator.toString() + "queries don't make sense on document keys", new Object[0]);
        return new KeyFieldFilter(fieldPath, operator, value);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof FieldFilter)) {
            FieldFilter fieldFilter = (FieldFilter) obj;
            if (this.operator == fieldFilter.operator && this.field.equals(fieldFilter.field) && this.value.equals(fieldFilter.value)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.firestore.core.Filter
    public String getCanonicalId() {
        return getField().canonicalString() + getOperator().toString() + Values.canonicalId(getValue());
    }

    public FieldPath getField() {
        return this.field;
    }

    @Override // com.google.firebase.firestore.core.Filter
    public List<Filter> getFilters() {
        return Collections.singletonList(this);
    }

    @Override // com.google.firebase.firestore.core.Filter
    public List<FieldFilter> getFlattenedFilters() {
        return Collections.singletonList(this);
    }

    public Operator getOperator() {
        return this.operator;
    }

    public Value getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + ((this.field.hashCode() + ((this.operator.hashCode() + 1147) * 31)) * 31);
    }

    public boolean isInequality() {
        return Arrays.asList(Operator.LESS_THAN, Operator.LESS_THAN_OR_EQUAL, Operator.GREATER_THAN, Operator.GREATER_THAN_OR_EQUAL, Operator.NOT_EQUAL, Operator.NOT_IN).contains(this.operator);
    }

    @Override // com.google.firebase.firestore.core.Filter
    public boolean matches(Document document) {
        Value field = document.getField(this.field);
        return this.operator == Operator.NOT_EQUAL ? (field == null || field.hasNullValue() || !matchesComparison(Values.compare(field, this.value))) ? false : true : field != null && Values.typeOrder(field) == Values.typeOrder(this.value) && matchesComparison(Values.compare(field, this.value));
    }

    public boolean matchesComparison(int i) {
        switch (C170571.f51774x833e630d[this.operator.ordinal()]) {
            case 1:
                return i < 0;
            case 2:
                return i <= 0;
            case 3:
                return i == 0;
            case 4:
                return i != 0;
            case 5:
                return i > 0;
            case 6:
                return i >= 0;
            default:
                throw Assert.fail("Unknown FieldFilter operator: %s", this.operator);
        }
    }

    public String toString() {
        return getCanonicalId();
    }
}
