package org.smartregister.chw.core.utils;

import org.smartregister.chw.core.application.CoreChwApplication;
import org.smartregister.chw.core.rule.MalariaFollowUpRule;

import java.util.Date;

import timber.log.Timber;

public class MalariaVisitUtil {

    public static MalariaFollowUpRule getMalariaStatus(Date malariaTestDate) {
        MalariaFollowUpRule malariaFollowUpRule = new MalariaFollowUpRule(malariaTestDate);
        try {
            CoreChwApplication.getInstance().getRulesEngineHelper().getMalariaRule(malariaFollowUpRule, CoreConstants.RULE_FILE.MALARIA_FOLLOW_UP_VISIT);
        }catch (Exception e){
            Timber.e(e);
        }
        return malariaFollowUpRule;
    }
}
