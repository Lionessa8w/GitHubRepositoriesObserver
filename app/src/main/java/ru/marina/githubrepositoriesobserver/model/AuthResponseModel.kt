package ru.marina.githubrepositoriesobserver.model

import com.google.gson.annotations.SerializedName
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


data class AuthResponseModel(
    @SerializedName("login") var login: String? = null,
    @SerializedName("id") var id: Int? = null,
    @SerializedName("node_id") var nodeId: String? = null,
    @SerializedName("avatar_url") var avatarUrl: String? = null,
    @SerializedName("gravatar_id") var gravatarId: String? = null,
    @SerializedName("url") var url: String? = null,
    @SerializedName("html_url") var htmlUrl: String? = null,
    @SerializedName("followers_url") var followersUrl: String? = null,
    @SerializedName("following_url") var followingUrl: String? = null,
    @SerializedName("gists_url") var gistsUrl: String? = null,
    @SerializedName("starred_url") var starredUrl: String? = null,
    @SerializedName("subscriptions_url") var subscriptionsUrl: String? = null,
    @SerializedName("organizations_url") var organizationsUrl: String? = null,
    @SerializedName("repos_url") var reposUrl: String? = null,
    @SerializedName("events_url") var eventsUrl: String? = null,
    @SerializedName("received_events_url") var receivedEventsUrl: String? = null,
    @SerializedName("type") var type: String? = null,
    @SerializedName("site_admin") var siteAdmin: Boolean? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("company") var company: String? = null,
    @SerializedName("blog") var blog: String? = null,
    @SerializedName("location") var location: String? = null,
    @SerializedName("email") var email: String? = null,
    @SerializedName("hireable") var hireable: String? = null,
    @SerializedName("bio") var bio: String? = null,
    @SerializedName("twitter_username") var twitterUsername: String? = null,
    @SerializedName("public_repos") var publicRepos: Int? = null,
    @SerializedName("public_gists") var publicGists: Int? = null,
    @SerializedName("followers") var followers: Int? = null,
    @SerializedName("following") var following: Int? = null,
    @SerializedName("created_at") var createdAt: String? = null,
    @SerializedName("updated_at") var updatedAt: String? = null,
    @SerializedName("private_gists") var privateGists: Int? = null,
    @SerializedName("total_private_repos") var totalPrivateRepos: Int? = null,
    @SerializedName("owned_private_repos") var ownedPrivateRepos: Int? = null,
    @SerializedName("disk_usage") var diskUsage: Int? = null,
    @SerializedName("collaborators") var collaborators: Int? = null,
    @SerializedName("two_factor_authentication") var twoFactorAuthentication: Boolean? = null,
    @SerializedName("plan") var authResponsePlanModel: AuthResponsePlanModel? = AuthResponsePlanModel()
)