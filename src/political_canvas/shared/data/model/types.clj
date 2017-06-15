(ns political_canvas.shared.data.model.types
  (:use [political_canvas.shared.data.schema.objects]))

(def social_media
  {:twitter (->SocialMediaType "Twitter" nil "www.twitter.com/foo" {:en_us "www.twitter.com"})
   :facebook (->SocialMediaType "Facebook" nil "www.facebook.com/foo" {:en_us "www.facebook.com"})
   :linked_in (->SocialMediaType "LinkedIn" nil "www.linkedin.com/foo" {:en_us "www.linkedin.com"})
   })

;; codes (2nd field) could represent non-english equivalents that I, in my ignorance, am unaware of
(def viewpoints
  {:education (->ViewpointsType "Education" nil {:en_us "Education"})
   :taxes (->ViewpointsType "Taxes" nil {:en_us "Taxes"})
   :transit (->ViewpointsType "Transit" "Mass_Transit" {:en_us "Mass Transit"})
   :healthcare (->ViewpointsType "Healthcare" nil {:en_us "Healthcare"})
   :pollution (->ViewpointsType "Pollution" nil {:en_us "Air, water, soil and food pollution"})
   :recycling (->ViewpointsType "Recycling" nil {:en_us "Material recycling"})
   :garbage (->ViewpointsType "Garbage" nil {:en_us "Local garbage collection"})
   :military (->ViewpointsType "Military" nil {:en_us "Military spending, conflicts, etc"})
   :police (->ViewpointsType "Police" nil {:en_us "Local police forces, activity, restrictions, etc"})
   :voting (->ViewpointsType "Voting" nil {:en_us "Democratic voting initiatives "})
   :immigration (->ViewpointsType "Immigration" nil {:en_us "Immigration process, laws, etc"})
   :budget (->ViewpointsType "Budget" nil {:en_us "Budget considerations, funding, concerns, etc"})
   :building_permits (->ViewpointsType "BuildingPermits" nil {:en_us "Building restrictions, permits, etc"})
   :consumer_rights (->ViewpointsType "ConsumerRights" nil {:en_us "A democracy should also support consumer rights"})
   })