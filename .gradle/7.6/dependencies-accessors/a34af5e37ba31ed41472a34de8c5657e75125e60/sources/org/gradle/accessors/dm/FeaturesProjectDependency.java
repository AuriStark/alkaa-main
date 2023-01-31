package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.ProjectDependency;
import org.gradle.api.internal.artifacts.dependencies.ProjectDependencyInternal;
import org.gradle.api.internal.artifacts.DefaultProjectDependencyFactory;
import org.gradle.api.internal.artifacts.dsl.dependencies.ProjectFinder;
import org.gradle.api.internal.catalog.DelegatingProjectDependency;
import org.gradle.api.internal.catalog.TypeSafeProjectDependencyFactory;
import javax.inject.Inject;

@NonNullApi
public class FeaturesProjectDependency extends DelegatingProjectDependency {

    @Inject
    public FeaturesProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":features:alarm"
     */
    public Features_AlarmProjectDependency getAlarm() { return new Features_AlarmProjectDependency(getFactory(), create(":features:alarm")); }

    /**
     * Creates a project dependency on the project at path ":features:alarm-api"
     */
    public Features_AlarmApiProjectDependency getAlarmApi() { return new Features_AlarmApiProjectDependency(getFactory(), create(":features:alarm-api")); }

    /**
     * Creates a project dependency on the project at path ":features:category"
     */
    public Features_CategoryProjectDependency getCategory() { return new Features_CategoryProjectDependency(getFactory(), create(":features:category")); }

    /**
     * Creates a project dependency on the project at path ":features:category-api"
     */
    public Features_CategoryApiProjectDependency getCategoryApi() { return new Features_CategoryApiProjectDependency(getFactory(), create(":features:category-api")); }

    /**
     * Creates a project dependency on the project at path ":features:glance"
     */
    public Features_GlanceProjectDependency getGlance() { return new Features_GlanceProjectDependency(getFactory(), create(":features:glance")); }

    /**
     * Creates a project dependency on the project at path ":features:preference"
     */
    public Features_PreferenceProjectDependency getPreference() { return new Features_PreferenceProjectDependency(getFactory(), create(":features:preference")); }

    /**
     * Creates a project dependency on the project at path ":features:search"
     */
    public Features_SearchProjectDependency getSearch() { return new Features_SearchProjectDependency(getFactory(), create(":features:search")); }

    /**
     * Creates a project dependency on the project at path ":features:task"
     */
    public Features_TaskProjectDependency getTask() { return new Features_TaskProjectDependency(getFactory(), create(":features:task")); }

    /**
     * Creates a project dependency on the project at path ":features:tracker"
     */
    public Features_TrackerProjectDependency getTracker() { return new Features_TrackerProjectDependency(getFactory(), create(":features:tracker")); }

}
